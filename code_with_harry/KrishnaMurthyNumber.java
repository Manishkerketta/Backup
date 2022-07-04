package code_with_harry;

public class KrishnaMurthyNumber {
    public static void main(String[] args) {
        int n = 145;
        int temp;
        int fac ;
        int sum =0;
        while (n > 0) {
            temp = n % 10;
            if (temp != 0) {
                fac = 1;
                for (int i = 1; i <= temp; i++) {

                    fac = fac * i;
                }

                sum =sum+ fac;
            }
            n = n / 10;

        }
        System.out.println(sum);
    }
}
