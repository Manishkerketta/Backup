package com.company;

public class Square {
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

    public static void main(String[] args) {
        Square s=new Square();
        s.side=3;
        System.out.println(s.perimeter());
        System.out.println(s.area());
    }
}
