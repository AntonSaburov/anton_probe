package edu.javacourse.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class ZipSimple
{
    private static Connection con;
    
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://10.248.40.58:5432/asoup";
        String login = "asoup";
        String password = "asoup";
        con = DriverManager.getConnection(url, login, password);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            String s = "" + Math.random();
            sb.append(s);
        }
    
        System.out.println("1:" + System.currentTimeMillis());
        byte[] answer1 = compress(sb.toString());
        System.out.println("2:" + System.currentTimeMillis());
        Class.forName("org.postgresql.Driver");
        saveToDb("1", answer1);
        System.out.println("3:" + System.currentTimeMillis());
        byte[] answer2 = loadFromDb();
        System.out.println("4:" + System.currentTimeMillis());
        System.out.println("LENGTH:" + answer1.length + ", " + answer2.length);
        System.out.println("5:" + System.currentTimeMillis());
        String test1 = decompress(answer1);
        System.out.println("EQUALS 1:" + test1.equals(sb.toString()));
        
        System.out.println("6:" + System.currentTimeMillis());
        String test2 = decompress(answer2);
        System.out.println("EQUALS 2:" + test2.equals(sb.toString()));
        System.out.println("7:" + System.currentTimeMillis());
    }

    public static byte[] compress(String text) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream out = new DeflaterOutputStream(baos);
        out.write(text.getBytes("UTF-8"));
        out.close();
        return baos.toByteArray();
    }

    public static String decompress(byte[] bytes) throws IOException {
        InputStream in = new InflaterInputStream(new ByteArrayInputStream(bytes));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int len;
        while ((len = in.read(buffer)) > 0) {
            baos.write(buffer, 0, len);
        }
        return new String(baos.toByteArray(), "UTF-8");
    }
    
    public static void saveToDb(String statId, byte[] answer) throws ClassNotFoundException, SQLException {
        PreparedStatement stmt = con.prepareStatement("INSERT INTO MONITOR_TEST (STAT_ID, BIN_DATA) VALUES (?, ?)");
        stmt.setString(1, statId);
        stmt.setBinaryStream(2, new ByteArrayInputStream(answer));
        stmt.executeUpdate();
    }
    
    public static byte[] loadFromDb() throws ClassNotFoundException, SQLException {
        byte[] bytes = null;
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM MONITOR_TEST");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
             bytes = rs.getBytes("BIN_DATA");
        }
        return bytes;
    }
}
