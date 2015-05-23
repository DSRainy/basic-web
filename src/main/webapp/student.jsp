<%-- 
    Document   : student
    Created on : 23-May-2015, 11:11:33
    Author     : RainWhileLoop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>student</title>
    </head>
    <body>
        My name is : <%= request.getAttribute("student")%>
    </body>
</html>
