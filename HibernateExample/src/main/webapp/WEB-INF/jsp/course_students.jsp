<%-- 
    Document   : course_students
    Created on : 13.1.2016, 19:41:05
    Author     : Opiframe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/css/style.css" />
        <title>Students</title>
    </head>
    <body>
        <div class="my_container">
            <h3>Students in course ${cName}</h3>
            <c:forEach var="data" items="${list}">
                <h3>${data.getStudents().getStudentName()}</h3>
            </c:forEach>
        </div>
    </body>
</html>
