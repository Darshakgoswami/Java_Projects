package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


import com.dao.Datadao;
import com.model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Datadao dao = new Datadao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password"); // raw password

      
        User u=new User();
        u.setEmail(email);
        u.setPassword(password);
        
       String s=dao.LoginData(u);
       if("Success".equalsIgnoreCase(s)) {
    	   RequestDispatcher rd=request.getRequestDispatcher("DascBoard.jsp");
    	   rd.forward(request, response);
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Direct GET requests to /Login should show the login page
      
    }
}