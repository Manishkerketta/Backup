package Loops;

public class Main {
    public  void display(int[] input){
       for(int i=0;i<input.length;i=i+1){
           System.out.println(input[i]+1);
       }
    }
    public static void main(String[] args) {
        int [] num={9,2,3,4,5,6};
        Main m=new Main();

        m.display(num);
    }
}
