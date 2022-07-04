package com.company;

public class ExceptionThrows {
   public  void display() throws InterruptedException{
        for(int i=1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    class main1 extends ExceptionThrows{
       void display1(){
           System.out.println("new class");
       }
    }

    public static void main(String[] args) {
       try{
           ExceptionThrows t=new ExceptionThrows();
           t.display();
           System.out.println(10/0);
       }
       catch(Exception e){
           System.out.println("ExceptionHandled");
       }
;
        System.out.println("main method ended");
    }
}
