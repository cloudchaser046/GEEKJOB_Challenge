<%-- 
    Document   : java hairetsu hairetsuno henkou
    Created on : 2017/09/19, 12:08:10
    Author     : jung_yucheol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

String[] data = {"10","100","soeda","hayashi","-20","118","END"};

data[2] = "33";

out.print(data[0]);
out.print(data[1]);
out.print(data[2]);
out.print(data[3]);
out.print(data[4]);
out.print(data[5]);
out.print(data[6]);

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>
