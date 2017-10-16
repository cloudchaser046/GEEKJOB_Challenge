/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.servlet;

/**
 *
 * @author jung_yucheol
 */
public class irekae {
    public static void main(String[] args){
        String word1 = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        String word2 = word1.replace("I","い");
        String word3 = word2.replace("U","う");
        System.out.print(word3);
        }
}
