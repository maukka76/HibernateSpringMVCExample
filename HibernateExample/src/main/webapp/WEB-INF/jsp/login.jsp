<%-- 
    Document   : login
    Created on : 15.1.2016, 12:59:39
    Author     : Opiframe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="/login" method="POST">
            <div class="input-group input-sm">
                <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
            </div>
            <div class="input-group input-sm">
                <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label> 
                <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
            </div>
            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
            <div class="form-actions">
                <input type="submit" class="btn btn-block btn-primary btn-default" value="Log in">
            </div>
        </form:form>
    </body>
</html>
