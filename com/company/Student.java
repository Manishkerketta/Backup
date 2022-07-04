package com.company;

public class Student {
    int age;
    String name;
    public Student(int age,String name){
       this.age=age;
        this.name=name;

        }
        public void display (){
            System.out.println(age+"\n"+name+"");
        }
//

    public static void main(String[] args) {
        Student s=new Student(12,"manish");
        Student s1=new Student(11,"rohan");
        s.display();
        s1.display();
    }
}
