<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Create Location</title>
    <style>
        input{
            margin: 10px 10px 0px 10px;
        }
        .submit{
            width: 250px;
            margin-left: 0px;
            padding: 10px;
            font-size: 20px;
        }
        .submit,table{
            width: 1000px;
            margin: 40px auto;
        }
        table thead th{
            border: 1px solid #999;
            padding: 10px;
            margin: 10px;
            font-size: 20px;
        }
        table tbody td{
            border: 1px solid #999;
            padding: 10px;
            margin: 10px;
            font-size: 20px;
            text-align: center;
        }
        .submit a{
            text-decoration: none;
            padding: 10px;
            margin-top: -20px;
            color: #111;
            border: 1px solid #999;
            width: 230px;
            display: inline-block;
            text-align: center;
            background: buttonface;
            font-size: 20px;
            height: 25px;
        }

        .delete{
            text-decoration: none;
            color: #777777;
        }
    </style>
</head>
<body style=" padding-top:50px;width: 1200px;color: #777;margin: 0 auto">
<h1 style="color: darkgray">Locations:</h1>
<hr style="color: darkgray">
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Code</th>
        <th>Type</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <% int id = 1;%>
    <c:forEach items="${locations}" var="location">
        <tr>

            <td><%= id%></td>
            <td>${location.name}</td>
            <td>${location.code}</td>
            <td>${location.type}</td>
            <td>
                <a class="delete" href="deletelocation?id=${location.id}">
                    delete
                </a>
            </td>
            <td>
                <a class="delete" href="editlocation?id=${location.id}">
                    edit
                </a>
            </td>
            <% id++;%>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="submit">
    <a href="create-location">
        Add Locations
    </a>
</div>
</body>

</html>