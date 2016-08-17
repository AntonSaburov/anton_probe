package edu.javacourse.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletInclude", urlPatterns = {"/ServletInclude"})
public class ServletInclude extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/page_01.jsp").include(request, response);
        getServletContext().getRequestDispatcher("/page_02.jsp").include(request, response);
    }

}
