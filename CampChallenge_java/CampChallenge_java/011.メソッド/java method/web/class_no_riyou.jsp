<%-- 
    Document   : class_no_riyou
    Created on : 2017/10/03, 15:16:26
    Author     : jung_yucheol
--%>
package org.mypackage.sample;

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
class Human {
    public String name = "";
    public int age = 0;
    
    public void setHuman(String n, int a) {
        
        this.name = n;
        this.age = a;
        
        printHuman(n, a);
    }
    public void printHuman(String n, int a) {
        System.out.println(n);
        System.out.println(a);
}
}
public class java {
    public static void main(String[] args) {
    Human hito = new Human();
    hito.age = 40;
    hito.setHuman("添田亮司", 34);
}
}
%>
