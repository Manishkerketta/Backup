package Loops;

public class Example {
    static Example1 e=new Example1();
    int display(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
       // e.display(5,4);
        System.out.println(e.display(5,4));
    }

}
class Example1{
    int display(int x,int y){
        return x-y;
    }
}
