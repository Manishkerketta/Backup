package com.company;

import java.util.Scanner;

public interface Client {
    void input();//public and abstract

    void output();
}
class Developer implements Client{
    String name;
    double salary;
    @Override
    public void input(){
        Scanner r=new Scanner(System.in);
        System.out.println("enter the username");
        name=r.nextLine();
        System.out.println("enter the salary");
        salary=r.nextDouble();
    }
   public void output(){
        System.out.println(name);
       System.out.println(salary);
    }


    public static void main(String[] args) {
        Client C1=new Developer();
        C1.input();
        C1.output();
    }
}
