package com.company;

public class Circle {
    static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }



}
