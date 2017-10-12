<%-- 
    Document   : result
    Created on : 26-sep-2017, 15:05:19
    Author     : shaun
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int[] input = (int[]) application.getAttribute("in");
            int[] output = (int[]) application.getAttribute("out");
                    
            out.println("Unsorted:" + Arrays.toString(input));
            out.println("<br>");
            out.println("Sorted:" + Arrays.toString(output));
                    
        %>
    </body>
</html>
