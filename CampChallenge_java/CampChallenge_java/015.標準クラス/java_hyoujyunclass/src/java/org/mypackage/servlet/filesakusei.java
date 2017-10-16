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
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jung_yucheol
 */
public class filesakusei{
    public static void main(String[] args) throws IOException{
        File fp = new File("test.txt");
        FileWriter fw = new FileWriter(fp, true);
        Date now = new Date();
        SimpleDateFormat sdf = 
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fw.write(sdf.format(now));
        fw.close();
}
}
