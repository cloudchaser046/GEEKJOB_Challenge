<%-- 
    Document   : java zyouken bunki if
    Created on : 2017/09/19, 10:33:34
    Author     : jung_yucheol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
int a = 1;
if (a == 1){
    out.print("1です！");
} else if(a == 2){
    out.print("プログラミングキャンプ！");
} else{
    out.print("その他です！");
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
