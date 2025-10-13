package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // 1. Get the current session (do not create a new one)
        HttpSession session = request.getSession(false); 

        if (session != null) {
            // 2. Invalidate the session, removing all attributes (like the "user" object)
            session.invalidate();
        }

        // 3. Redirect the user back to the login page or the home page
        // Use the context path for robust redirection
        response.sendRedirect(request.getContextPath() + "/Bank.jsp"); 
    }

    // You can leave doPost empty or call doGet if needed
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}