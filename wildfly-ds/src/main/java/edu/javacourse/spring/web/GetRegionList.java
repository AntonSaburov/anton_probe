package edu.javacourse.spring.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class GetRegionList extends HttpServlet 
{

//    @Override
//    public void init() throws ServletException {
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace(System.out);
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            System.out.println("=========================>>>>>");
            Connection con = null;
            String dsType = request.getParameter("ds");
            System.out.println("Try to check DS:" + dsType);
            if ("0".equals(dsType)) {
                String url = "jdbc:postgresql://localhost:5432/javacourse";
                String login = "postgres";
                String password = "postgres";
                con = DriverManager.getConnection(url, login, password);
            } else {
                InitialContext ic = new InitialContext();
                DataSource ds = (DataSource) ic.lookup("1".equals(dsType)
                        ? "java:/MyDS" : "java:/MyXADS");
                con = ds.getConnection();
            }
            PreparedStatement pst = con.prepareStatement("select distinct table_schema from information_schema.tables");
            ResultSet srs = pst.executeQuery();
            while (srs.next()) {
                System.out.println("Schema:" + srs.getString(1));
            }
            System.out.println("=========================>>>>>");
            try {
                PreparedStatement st = con.prepareStatement("select * from test.jc_region");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    System.out.println("Region:" + rs.getString(1));
                }
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
