package Loops;

import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n;int a=0;
        n=s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                a=a+1;
                System.out.println("not prime");
            }
        }
        if(a==2) {
            System.out.println("yes prime");
        }

    }
}
