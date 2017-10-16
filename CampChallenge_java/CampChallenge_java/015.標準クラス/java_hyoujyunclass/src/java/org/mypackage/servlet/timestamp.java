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
import java.util.Calendar;


/**
 *
 * @author jung_yucheol
 */
public class timestamp{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2016,0,1,0,0,0);
        System.out.print(c.getTime());
    }
}
