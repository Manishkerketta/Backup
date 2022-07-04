package com.company;

public class Cellphone {
    static public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }

    public static void main(String[] args) {
        Cellphone c=new Cellphone();
        c.ring();
    }
}
