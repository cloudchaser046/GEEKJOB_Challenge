<%-- 
    Document   : java zyouken bunki switch
    Created on : 2017/09/19, 11:06:28
    Author     : jung_yucheol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

int a = 3;

switch(a){
    
    case 1:
        out.print("one");
        break;
    
    case 2:
        out.print("two");
        break;
    
    default:
        out.print("想定外");
        break;
}
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>
