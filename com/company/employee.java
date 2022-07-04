package com.company;

public class employee{
   private int age;
   private String name;
    public employee(int age,String name){
        this.age=age;
       this.name=name;
   }
    public void display(){
        System.out.println(age+""+"name");
    }

    public static void main(String[] args) {
        employee e=new employee(20,"rohan");
       // employee e=new employee();
        e.display();
    }
}