<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/custom-hello" method = "post">
        First name:<br>
        <input type="text" name="firstname" ><br>
        Last name:<br>
        <input type="text" name="lastname" ><br><br>
        Hour:<br>
        <input type="time" name="hour" ><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
