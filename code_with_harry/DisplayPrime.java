package code_with_harry;

public class DisplayPrime {
    public int display(int n) {


        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1) {
                System.out.println(i);

            }

        }

        return n;
    }

    public static void main(String[] args) {
        DisplayPrime displayPrime=new DisplayPrime();
        displayPrime.display(7);
    }
}
