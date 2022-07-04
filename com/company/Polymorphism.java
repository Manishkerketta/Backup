package com.company;

 class Polymorphism {
    void show(int a){
        System.out.println("method arguments is called");
    }

     void show(){
        System.out.println("method 1 is calling");
    }

    public static void main(String[] args) {
        System.out.println("arguments with string type");
Polymorphism p=new Polymorphism();
p.show(10);
p.main(2);

    }
    public static void main(int a){
        System.out.println("main method is called with argument");
    }
}
