<%-- 
    Document   : index
    Created on : 22 abr. 2026, 8:46:17 a. m.
    Author     : docente.fia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i=0;i<10;i++){
                out.println(i);
            }
        %>
    </body>
</html>
