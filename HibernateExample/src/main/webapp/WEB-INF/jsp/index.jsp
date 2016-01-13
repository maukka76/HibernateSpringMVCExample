<%-- 
    Document   : index
    Created on : 13.1.2016, 17:02:11
    Author     : Opiframe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link rel="stylesheet" type="text/css" href="resources/css/style.css" />
        <title>School</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="my_container">
            <form:form method="POST" action="/courses" modelAttribute="courses">
                <h3>Teachers</h3>
                <form:select class="form-control" path="teacherName" >
                    <form:option value="NONE" label="--- Select ---"/>
                    <c:forEach var="teach" items="${teachers}">
                        <form:option value="${teach.getTeacherName()}">
                            ${teach.getTeacherName()} - ${teach.getTeacherPosition()}
                        </form:option>                            
                    </c:forEach>
                </form:select>
                <input class="btn btn-primary button_style" type="submit" value="Get Courses"/> 
            </form:form>
            <input class="button_style" type="button" value="TestJavaScript" id="test"/>
            <p id="foobar"></p>
        </div>
        <script src="resources/js/myscript.js"></script>
    </body>
</html>
