<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
</head>
<body>
    <h1>
        <%
            String resultat = (String) request.getAttribute("resultat");
            out.println(resultat);
        %>
    </h1>
</body>
</html>
