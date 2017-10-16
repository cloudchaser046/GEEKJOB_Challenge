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
public class Dealer extends Human {
    ArrayList<Integer> cards = new ArrayList();
        public Dealer(){
        for(int i = 1;i<=4;i++){
            for(int j = 1;j <= 13;j++){
                if(j <= 10){
                    cards.add(j);
                    }else{
                    cards.add(10);
                }
            }
        }
    }
//Deal
public ArrayList<Integer> deal(){
    ArrayList <Integer> dealCard = new ArrayList<Integer>();
    Random rand = new Random();
    
    for(int i = 0;i<2;i++){
        int Index = rand.nextInt(cards.size());
        dealCard.add(cards.get(Index));
        cards.remove(Index);
    }
    return dealCard;
}

public ArrayList<Integer> hit() {
    ArrayList<Integer> hitCard = new ArrayList<>();
    Random rand = new Random();
    int Index = rand.nextInt(cards.size());
    hitCard.add(cards.get(Index));
    cards.remove(Index);
    return hitCard;
}

@Override
public int open() {
    int total = 0;
    for (int i = 0;i < myCards.size();i++) {
        total = total + myCards.get(i);
    }
    return total;
}

@Override
public boolean checkSum(){
    int total = open();
    if(total <= 16){
        return true;
        }else{
        return false;
    }
}

@Override
public void setCard(ArrayList<Integer> set){
    for(int i = 0;i < set.size();i++){
        myCards.add(set.get(i));
    }
}
}

