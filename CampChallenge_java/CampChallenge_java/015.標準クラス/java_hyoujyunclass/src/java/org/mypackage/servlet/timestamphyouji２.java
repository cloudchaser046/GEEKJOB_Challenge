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
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author jung_yucheol
 */
public class timestamphyouji２ {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date day1 = sdf.parse("2015/01/01 00:00:00");
        Date day2 = sdf.parse("2015/12/31 23:59:59");
        
        long sa = (day2.getTime() - day1.getTime());
        System.out.print("差は" + sa + "です");
    }
}
