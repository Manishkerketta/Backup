package com.company;

abstract class Vehicle{
       abstract void start();

}
class car extends Vehicle{
        @Override
        void start(){
                System.out.println("car start with key");
        }



        public static void main(String[] args) {
                car c =new car();
                c.start();
bike b=new bike();
b.start();

        }

                }
class bike extends Vehicle {
        @Override
        void start() {
                System.out.println("bike start with kick");
        }
}










