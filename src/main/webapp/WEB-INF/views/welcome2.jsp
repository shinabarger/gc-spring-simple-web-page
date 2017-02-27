<%--
  Created by IntelliJ IDEA.
  User: kamel
  Date: 1/12/2017
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body {
        align: center;
        margin-top: 50px;
    }
    a {
        padding: 10px;

    }
</style>
<body>
<center>
    <p>
        <a href="/"> HOME</a>
        <a href="welcome" >VIEW NUMBERS</a>
        <a href="displayDate">SEE TODAY'S DATE</a>
        <a href="randomizeJoke">RANDOM JOKE</a>
    </p>
    <br/>
    ${message[0]}
    <br/>

    <c:forEach var="myvar" items="${message}">
        ${myvar}
        <br/>
    </c:forEach>
    <br/>


</center>
</body>
</html>
