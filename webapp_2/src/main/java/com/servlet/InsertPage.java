package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.dao.Datadao;
import com.model.User;

@WebServlet("/InsertPage")
public class InsertPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Datadao dao = new Datadao();
       
    public InsertPage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		String id = request.getParameter("id");
		System.out.println("Action: " + action + " ID: " + id);
	
        // Use null checks before calling .equals()
		if(action != null && action.equals("edit")) {
			User u = dao.fetchData(Integer.parseInt(id));
			request.setAttribute("Edit",u);
			RequestDispatcher rs = request.getRequestDispatcher("Update.jsp");
			rs.forward(request, response);
            return; // Exit method after forwarding
		}
        
        // FIX: Removed semicolon after if condition
        else if(action != null && action.equals("Update")) {
			String username=request.getParameter("username");
			String phone=request.getParameter("phone");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			String user_id=request.getParameter("id");
			
			User u=new User();
			u.setEmail(email);
			u.setId(Integer.parseInt(user_id));
			u.setPassword(password);
			u.setPhone(phone);
			u.setUsername(username);
			
			String s=dao.UpdateData(u);
			if(s.equals("success")) // Semicolon removed
			{
				RequestDispatcher rd=request.getRequestDispatcher("ShowAllData");
				rd.forward(request, response);
                return; // Exit method after forwarding
			}
		}
        
		else if(action != null && "delete".equalsIgnoreCase(action)){
			String user_id=request.getParameter("id");
			String s=dao.DeleteId(Integer.parseInt(user_id));

			if("Delete".equalsIgnoreCase(s)) {
				RequestDispatcher rd=request.getRequestDispatcher("ShowAllData");
				rd.forward(request, response);
                return; // Exit method after forwarding
			}
			
		}

        // Default behavior: show all data
		List<User> list = dao.showalldata();
		request.setAttribute("List",list);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		// response.getWriter().append("Served at: ").append(request.getContextPath()); // Removed to prevent potential double-output
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
        
        // 🚨 CRITICAL FIX: Pass the 'email' address, not the 'phone' number.
		Mailer.send(email, "Registration Confirmation", "Thank you for registering! Your username is: " + username);
		
		User user = new User();
		
		user.setUsername(username);
		user.setPhone(phone);
		user.setEmail(email);
		user.setPassword(password);
		
		Datadao dao = new Datadao(); // Note: Better practice is to use the class-level 'this.dao'
		
		String s = dao.InsertData(user);
		if(s.equalsIgnoreCase("Success")) {
			request.setAttribute("msg", "Data Inserted Successfully! Email sending attempted.");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
            return; // Stop processing
		}
		
        // If DB insertion fails, handle the error or redirect back to registration
        request.setAttribute("error", "Registration failed. Please try again.");
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); 
        rd.forward(request, response);
	}
}