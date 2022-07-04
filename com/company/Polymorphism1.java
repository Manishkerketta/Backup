package com.company;

class Polymorphism1 {
void show(){
    System.out.println("method is overriding");
}
}
class Poly extends Polymorphism1{
    @Override
    void show(){

        System.out.println("overriding");
    }

    public static void main(String[] args) {

//        Poly p1=new Poly();
//        p1.show();
        Polymorphism1 p2=new Poly();
        p2.show();

    }
}
