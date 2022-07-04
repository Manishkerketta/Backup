package com.company;

public class ExceptionHandling {
    void divide(int a,int b){
        if(b==0){
            throw new ArithmeticException();
        }
        else{
           int c=a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        ExceptionHandling d=new ExceptionHandling();
        try{
            d.divide(20,0);
            System.out.println("throw done");
        }
        catch(Exception e){
            System.out.println("the value of b is 0");
        }


    }
}
