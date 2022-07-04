package com.company;

public class object {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    public object(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        object m1=new object("john",22);
        System.out.println(m1.getName());
    }
}
