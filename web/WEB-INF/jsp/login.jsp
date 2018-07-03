<%-- 
    Document   : login
    Created on : Jan 2, 2018, 9:51:02 AM
    Author     : Jagadheesan Balu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <span style="color:red" ><%=request.getParameter("errorMsg") %></span>
        <form action="/SampleWebApp/welcome/greet" method="POST" >
            <input type="text" name="name"/>
            <input type="text" name="pass"/>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>
