<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>

<%@ page import="com.model.User" %>

<%@ page import="java.util.Base64" %> <%-- CRITICAL: Import Base64 utility --%>



<%-- 1. SESSION PROTECTION --%>


<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>User Dascboard</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>

        .profile-img {

            width: 150px;

            height: 150px;

            object-fit: cover;

            border-radius: 50%; /* Makes the image circular */

            border: 4px solid #0077b6;

            margin-bottom: 20px;

        }

        .card-header-bg {

            background-color: #0077b6;

            color: white;

            font-weight: bold;

        }

    </style>

</head>

<body>



<div class="container my-5">

    

   


    <h1 class="mb-4 text-center">Welcome Back, </h1>



    <div class="card">

        <div class="card-header card-header-bg">

            Account Summary

        </div>

        <div class="card-body">

            <ul class="list-group list-group-flush">

                <li class="list-group-item"><strong>Account Holder:</strong> </li>

                <li class="list-group-item"><strong>Account ID:</strong> </li>

                <li class="list-group-item"><strong>Email:</strong></li>

                <li class="list-group-item"><strong>Phone:</strong> </li>

                <li class="list-group-item"><strong>Current Balance:</strong> ₹5000 (Placeholder - To be implemented next!)</li> 

            </ul>

        </div>

    </div>



    <div class="mt-4 text-center">

        <a href="${pageContext.request.contextPath}/Logout" class="btn btn-danger btn-lg">Logout</a> 

    </div>



</div>



</body>

</html>