/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jung_yucheol
 */

class Humankeisyo {
    public String name = "";
    public Integer age = 0;
    
    public void setHumankeisyo(String n, int a) {
        
        this.name = n;
                this.age = a;

        printHumankeisyo(n, a);
    }
    public void printHumankeisyo(String n, int a) {
        System.out.println("前");
        System.out.println(n);
        System.out.println(a);
}
}

class keisyogo extends Humankeisyo {
    public void go() {
        this.name = null;
        this.age = null;
        
        System.out.println("後");
        
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class classnokeisyo {
    public static void main(String[] args) {
    keisyogo soeda = new keisyogo();
    soeda.age = 30;
    soeda.setHumankeisyo("添田亮司", 34);
    soeda.go();
}
}