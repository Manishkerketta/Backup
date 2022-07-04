package Loops;

public class Xyz {
    public static void main(String[] args) {
        A a=new A();
        a.display();

    }
}
class A{
    B b=new B();
    public void display(){
        System.out.println("No");
        b.display();
    }
}
class B{
    public B(){

    }
    public void display()
            {
                System.out.println("Yes");
    }

        }
