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
public class bytemoji {
    public static void main(String[] arg){
        String name = "鄭裕澈";
        
        System.out.println(name);
        System.out.println("バイト数は" + name.getBytes().length);
        System.out.println("文字数は" + name.length());
    }
}
