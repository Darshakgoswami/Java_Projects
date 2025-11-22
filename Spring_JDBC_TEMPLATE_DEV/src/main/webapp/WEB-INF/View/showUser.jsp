<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Student List</h2>
<table border="1">
<tr>
<th>id</th>
<th>Username</th>
<th>Password</th>
</tr>

<c:forEach var="user" items="${users}">
<tr>
<td>${user.id}</td>
<td><c:out value="${user.username}"/></td>
<td>${user.password}</td>
<td><a href="edit?id=${user.id}">Edit</a>
<td><a href="delet?id=${user.id}">delete</a>
</tr>
</c:forEach>
</table>
</body>
</html>