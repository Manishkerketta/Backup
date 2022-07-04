package searching;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int n= sc.nextInt();
int n=1231;
        int rev=0;
        while(n>0){
            rev=rev+n%10;
            n=n/10;
        }
        System.out.println(rev);

    }
}
