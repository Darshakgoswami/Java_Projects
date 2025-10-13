<%@ page import="com.model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%  User u = (User) request.getAttribute("Edit"); 		%>
		<form action="insert" method="post" enctype="multipart/form-data">
              <input type="text" class="form-control" placeholder="ID" name="id" hidden="true" value="<%= u.getId() %>" required>  
              <input type="text" class="form-control" placeholder="Action" name="action" hidden="true" value="update" required> 
              <input type="text" class="form-control" placeholder="Full Name" name="username" value="<%= u.getUsername() %>" required>           
              <input type="email" class="form-control" placeholder="Email" name="email" value="<%= u.getEmail() %>" required>            
              <input type="text" class="form-control" placeholder="Phone Number" name="phone" value="<%= u.getPhone() %>" required>            
              <input type="password" class="form-control" placeholder="Password" name="password" value=<%= u.getPassword() %> required>         
              <input type="file" class="form-control" placeholder="Image" name="image" value=<%= u.getImage() %> required>                      
              <input type="submit" class="btn btn-primary w-100" value="Update">
              <p class="text-center mt-3">Already have an account? <a href="#login">Login here</a></p>
          </form>
        
        <%
          	String s = (String) request.getAttribute("msg");
          	if(s!=null){
        	  	out.println(s);
          	}
        %>
  
    
</body>
</html>