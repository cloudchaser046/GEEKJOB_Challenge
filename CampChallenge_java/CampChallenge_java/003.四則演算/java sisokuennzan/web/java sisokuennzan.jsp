<%-- 
    Document   : java sisokuennzan
    Created on : 2017/09/18, 22:34:51
    Author     : jung_yucheol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

final int BASE = 50;
int num = 8;

int tasu = BASE + num;
int hiku = BASE - num;
int kake = BASE * num;
int wari = BASE / num;
int amari = BASE % num;

out.print(tasu+"<br>");
out.print(hiku+"<br>");
out.print(kake+"<br>");
out.print(wari+"<br>");
out.print(amari+"<br>");

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>
