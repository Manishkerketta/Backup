package com.company.Calculator;

public class Calculator {
    CalculatorSevice service;
    int perform(int a,int b){
        return service.add(a,b);

    }

    public static void main(String[] args) {
        addition a=new addition();
        System.out.println(a.add(5,5));
    }
}
