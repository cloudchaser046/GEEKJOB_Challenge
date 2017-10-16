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

/**
 *
 * @author jung_yucheol
 */
public class User extends Human {

@Override
public int open() {
    int total = 0;
    for(int i = 0;i < myCards.size();i++){
        total += myCards.get(i);
    }
    return total;
}

@Override
public boolean checkSum(){
    int total = open();
    if(total <= 20){
        return true;
    }else{
        return false;
    }
}

@Override
public void setCard(ArrayList<Integer> set){
    for(int i = 0;i <set.size();i++){
        myCards.add(set.get(i));
    }
}
}