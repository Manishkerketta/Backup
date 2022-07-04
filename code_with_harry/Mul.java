package code_with_harry;

public class Mul {

   static void display(int n){
      // int c=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
Mul.display(4);
    }
}
