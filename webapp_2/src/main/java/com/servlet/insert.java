package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;

import com.dao.Datadao;
import com.model.User;
// 1. IMPORT THE MAILER CLASS
// Note: Assuming Mailer is in the same package (com.servlet) or imported if in a different one.

/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")
@MultipartConfig // Essential for handling file uploads (Part image = ...)
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public insert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// This method is generally not used for submission logic. 
        // It's often better to avoid calling doGet from doPost.
        // I will remove the doGet call from doPost.
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email"); // Get the recipient email
		String password = request.getParameter("password");
//		String action = ;
        // Handle Image Upload
		Part image = request.getPart("image");
		InputStream is = image.getInputStream();
		byte[] imageBytes = is.readAllBytes(); // Renamed for clarity
		
		User user = new User();
		
		user.setUsername(username);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		user.setImage(imageBytes);
		
		Datadao dao = new Datadao();
		
//		if(request.getParameter("action").equals("update")) {
//			int id = Integer.parseInt(request.getParameter("id"));
//			String s = dao.UpdateData(user);
//			if(s.equals("success")) {
//				
//				RequestDispatcher rd = request.getRequestDispatcher("showdata.jsp");
//				rd.forward(request, response);
//			}
//		}else {
			String s = dao.InsertData(user);
	        
			if(s.equalsIgnoreCase("success")) {
	            
	            // 2. CALL THE MAILER METHOD HERE
	            try {
	                // Pass the 'email' for the recipient, not the 'phone'
	                Mailer.send(email, "Account Registration Successful", "Welcome " + username + "!\n\nYour account has been successfully created. Thank you for choosing our bank app.");
	                request.setAttribute("msg", "Data Inserted Successfully! Email confirmation sent.");
	            } catch (Exception e) {
	                // This catch handles errors during email sending without stopping the user's registration
	                System.err.println("Failed to send registration email to " + email);
	                e.printStackTrace();
	                request.setAttribute("msg", "Data Inserted Successfully! But email confirmation failed.");
	            }
	            
				RequestDispatcher rd = request.getRequestDispatcher("Bank.jsp");
				rd.forward(request, response);
	            return; // Exit method
			} else {
	            // Handle database insertion failure
	            request.setAttribute("error", "Database Insertion Failed. Please try again.");
	            RequestDispatcher rd = request.getRequestDispatcher("Bank.jsp"); // Or return to the form page
				rd.forward(request, response);
	            return;
	        }
//		}
		
        
        // Removed doGet(request, response); - You generally shouldn't call doGet from doPost.
	}
}