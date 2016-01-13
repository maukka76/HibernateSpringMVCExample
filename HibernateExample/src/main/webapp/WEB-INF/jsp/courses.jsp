<%-- 
    Document   : courses
    Created on : 13.1.2016, 18:02:44
    Author     : Opiframe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/css/style.css" />
        <title>Courses</title>
    </head>
    <body>
        <div class="my_container">
            <h3>Name: ${name}</h3>
            <ul>
                <c:forEach varStatus="status" var="courseName" items="${list}">
                    <li><a href="/cinfo?id=${ids[status.index]}">${courseName}</a></li>
                </c:forEach>
            </ul>    
        </div>
    </body>
</html>
