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
    </style>
</head>

<body style=" padding-top:50px;width: 1200px;color: darkgray;margin: 0 auto">
<h1 style="color: darkgray">Create Location:</h1>
<hr style="color: darkgray">
<form action="" style="padding: 10px">
    Id:<input type="text" name="id"><br>
    Name:<input type="text" name="name"><br>
    Code:<input type="text" name="code"><br>
    Type:<br>Urban<input type="radio" name="type"><br>
    Rural<input type="radio" name="type"><br>
    <input class="submit" type="submit" value="Save">
</form>
</body>

</html>