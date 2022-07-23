<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
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
        a{
            text-decoration: none;
            margin-top: -30px;
            padding: 10px;
            color: #111;
            border: 1px solid #999;
            width: 230px;
            display: inline-block;
            text-align: center;
            background: buttonface;
            font-size: 20px;
            height: 25px;
        }
    </style>
</head>

<body style=" padding-top:50px;width: 1200px;color: darkgray;margin: 0 auto">
<h1 style="color: darkgray">Create Location:</h1>
<hr style="color: darkgray">
<form action="saveLocation"  method="post" style="padding: 10px">
    Id:<input type="text" name="id"><br>
    Name:<input type="text" name="name"><br>
    Code:<input type="text" name="code"><br>
    Type:<br>Urban<input type="radio" name="type" value="Urban"><br>
    Rural<input type="radio" name="type" value="Rural"><br>
    <input class="submit" type="submit" value="Save">
</form>
<div class="submit">${msg}</div>
<div class="submit">
    <a href="/displayAll">
        View Locations
    </a>
</div>
</body>

</html>