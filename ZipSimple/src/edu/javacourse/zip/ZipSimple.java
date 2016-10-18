package edu.javacourse.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class ZipSimple
{
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("1234567890");
        }
        byte[] answer = compress(sb.toString());
        String test = decompress(answer);
        System.out.println("EQUALS:" + test.equals(sb.toString()));
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
}
