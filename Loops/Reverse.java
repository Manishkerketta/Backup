package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int n;
        int rev=0;
        n=sc.nextInt();
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;

        }
        System.out.println(rev);
    }
}
