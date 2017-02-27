<%--
  Created by IntelliJ IDEA.
  User: davidshinabarger
  Date: 2/27/17
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <p>TODAY'S DATE IS: </p>

    <p id="date">
        ${dateToday}
        <br/>
    </p>
    <br/>


</center>
</body>
</html>
