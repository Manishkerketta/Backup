package com.company;

public class MyEmployee {
    private int id;
    private int salary;
    private String name;


    public int getId(){
        return id;
        }
        public void setId(int i){
        id=i;
        }
        public int getsalary()
        {
        return salary;
        }
        public void setsalary(int i){
        salary=i;

        }
public String getName(){
        return name;
}
public void setName(String s){
        name=s;
}
    public static void main(String[] args) {

MyEmployee m1=new MyEmployee();
m1.setName("manish");
        System.out.println(m1.getName());
        m1.setId(21);
        System.out.println(m1.getId());

    }

}
