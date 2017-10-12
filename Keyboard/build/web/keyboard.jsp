<%-- 
    Document   : keyboard
    Created on : 29-sep-2017, 5:38:44
    Author     : shaun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String input = (String) application.getAttribute("in");
            String output = (String) application.getAttribute("out");

            out.println("Azerty:" + input);
            out.println("<br>");
            out.println("Qwerty:" + output);

        %>
        </br>
        <a href="index.html">Home</a>
    </body>
</html>
