<!DOCTYPE html>
<html>
    <head>
        <meta charset="x-UTF-16LE-BOM">
        <title>Murach's Java Servlets and JSP</title>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link rel="stylesheet" href="../../css/main.css" type="text/css">
    </head>

    <body>
    <div class="Outside">
        <h1>Thanks for taking our survey!</h1>

        <p>Here is the information that you entered:</p>

        <label>Email:</label>
        <span>${user.email}</span><br>

        <label>First Name:</label>
        <span>${user.firstName}</span><br>

        <label>Last Name:</label>
        <span>${user.lastName}</span><br>

        <br>
        <input type="button" value="Return!" onclick="history.back()">
    </div>

    </body>
</html>