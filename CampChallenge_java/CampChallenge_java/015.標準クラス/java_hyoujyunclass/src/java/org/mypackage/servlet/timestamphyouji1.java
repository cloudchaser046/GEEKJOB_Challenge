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

/**
 *
 * @author jung_yucheol
 */
public class timestamphyouji1 {
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat sdf = 
                new SimpleDateFormat("2016年11月04日 10時0分0秒");
        System.out.print(sdf.format(now));
    }
}