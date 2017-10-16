/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author jung_yucheol
 */
public class genzainichiji {
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat sdf = 
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.print(sdf.format(now));
    }
}
