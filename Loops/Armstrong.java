package Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter number");

int n;
int rem;
int arm=0;

n=sc.nextInt();
        int c=n;
while(n>0){
    rem=n%10;
    arm=(rem*rem*rem)+arm;
    n=n/10;
}
if(c==arm){
    System.out.println("number is armstrong");
}
else{
    System.out.println("not armstrong");
}
    }

}
