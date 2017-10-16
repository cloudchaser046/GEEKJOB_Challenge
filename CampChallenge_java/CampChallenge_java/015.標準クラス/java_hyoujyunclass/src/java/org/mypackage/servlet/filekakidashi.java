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

/**
 *
 * @author jung_yucheol
 */
public class filekakidashi {
    public static void main(String[] args) throws IOException{
        File fp = new File("test.txt");
        FileWriter fw = new FileWriter(fp);
        fw.write("鄭裕澈です。よろしくお願いします。");
        fw.close();
    }
}
