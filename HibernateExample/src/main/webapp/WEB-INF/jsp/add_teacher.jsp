<%-- 
    Document   : add_teacher
    Created on : 13.1.2016, 20:07:53
    Author     : Opiframe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/css/style.css" />
        <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css" />
        <title>Add New Teacher</title>
    </head>
    <body>
        <div class="my_container">
            <h3>Fill up new teacher info</h3>
            <form:form method="POST" action="/teacher" modelAttribute="teacher">
                <label>Teacher name:</label><br/>
                <form:input cssClass="form-control" path="teacherName"></form:input><br/>
                <label>Position</label>
                <form:input cssClass="form-control" path="teacherPosition"></form:input><br/>
                <input class="btn btn-primary" type="submit" value="Send">
            </form:form>
        </div>
    </body>
</html>
