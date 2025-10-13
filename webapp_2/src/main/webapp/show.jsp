<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Base64" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-4">
    <h2 class="text-center mb-4">User List</h2>
    <div class="text-end mb-3">
         <a href="index.jsp" class="btn btn-secondary">Go to Home</a>
    </div>

    <%
        List<User> list = (List<User>) request.getAttribute("List");
    %>

    <table class="table table-bordered table-striped table-hover text-center">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Password</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Image</th> 
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
        <%
            if(list != null && !list.isEmpty()){
                for(User u : list){
        %>
        
            <tr>
                <td><%= u.getId() %></td>
                <td><%= u.getUsername() %></td>
                <td>********</td> <%-- Security: Masking password --%>
                <td><%= u.getPhone() %></td>
                <td><%= u.getEmail() %></td>
                
                <%-- ✅ CORRECT PLACEMENT: Image Display Column --%>
                <td style="width: 100px;"> 
                    <% 
                        byte[] imageBytes = u.getImage();
                        if (imageBytes != null && imageBytes.length > 0) {
                            String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                    %>
                            <img src="data:image/jpeg;base64, <%= base64Image %>" alt="Profile" style="width: 50px; height: 50px; object-fit: cover; border-radius: 50%;">
                    <% 
                        } else { 
                    %>
                            No Image
                    <% 
                        } 
                    %>
                </td>
                
                <%-- ✅ CORRECT PLACEMENT: Action Column --%>
                <td>
                    <a href="InsertPage?action=edit&id=<%=u.getId() %>" class="btn btn-sm btn-primary">Edit</a>
                    <a href="InsertPage?action=delete&id=<%=u.getId() %>" class="btn btn-sm btn-danger" 
                       onclick="return confirm('Are you sure you want to delete <%= u.getUsername() %>?');">Delete</a>
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="7" class="text-center text-muted">No users found</td> <%-- Updated colspan to 7 --%>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>