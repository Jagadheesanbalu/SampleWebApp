<%-- 
    Document   : welcomePage
    Created on : Sep 26, 2017, 9:38:14 AM
    Author     : baluj
--%>

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="org.codehaus.jettison.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome Jaggy</h1>
        <% 
           String user = (String)request.getSession().getAttribute("user");
            List<String> list = (List<String>)request.getAttribute("message");
            for(String s : list) {
        %>
        <div><%= s %></div>
        <% } %>
        <div><%= user %></div>
        <%-- <c:forEach items="${message}" var="list">
            <div>${list}</div>
        </c:forEach> --%>
    </body>
</html>
