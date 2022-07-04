package com.company;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i=i+1;
//        }
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }
        int n;
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check whether its is prime number or not");
        n=sc.nextInt();
//        int i=1;
//        while(i<n){
//            if(n%i==0)
//                count=count+1;
//                i=i+1;
//
//        }
//        if(count==2){
//            System.out.println("no is prime");
//        }
//        else{
//            System.out.println("number is not prime");
//        }

        for(int i=1;i<=n;i++){
            if(n%i==0){
                a=a+1;
            }
        }
        if(a==2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
   }


}
