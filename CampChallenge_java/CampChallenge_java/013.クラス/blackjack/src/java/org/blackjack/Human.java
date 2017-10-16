/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackjack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jung_yucheol
 */
public abstract class Human {
    public abstract int open();
    public abstract void setCard(ArrayList<Integer>set);
    public abstract boolean checkSum();
    ArrayList<Integer> myCards = new ArrayList<Integer>();
}
