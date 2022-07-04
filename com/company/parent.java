package com.company;

public class parent {
    public void m1() {
        System.out.println("manish");
    }
}
    class child extends parent {
    public void m2() {
        System.out.println("manchild");
    }

        public static void main(String[] args) {
            parent p =new parent();
            p.m1();
            child c=new child();
            c.m1();
            c.m2();
        }
}


