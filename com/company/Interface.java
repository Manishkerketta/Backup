package com.company;

 interface Animal {
     public void sound();
 }

  interface Animal2{
      public void eat();

  }
  interface Animal3{
     public void sleep();
  }
class Pig implements Animal,Animal2,Animal3{
    @Override
    public void sound(){
        System.out.println("pig is making sound");

    }
    @Override
    public void sleep(){
        System.out.println("pig is sleeping");
    }

    public void eat(){
        System.out.println("pig is eating");
    }



        public static void main(String[] args) {
        Pig pig1 = new Pig();
        pig1.sound();
        pig1.eat();
        pig1.sleep();
        Dog d1=new Dog();
        d1.sound();
        Cat cat1=new Cat();
        cat1.sound();
    }
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("dog is barking");
    }
}
class Cat implements Animal{
     @Override
     public void sound(){
         System.out.println("cat is listnening music");
     }
}


