package Loops;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int a=s.nextInt();


//        int b=10;
        int c=0;
        for(int i=2;i<a;i++){
            if (a % i == 0) {
                c = c + 1;
            }
            }
            if(c>0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }



            // String [] a={"manish","rohan","raju","john","cena"};


            //  for(int i=0;i<a.length;i++){
            // for (String w:a)
            // {
            // System.out.println(w);}

            // }

            // Scanner s1=new Scanner(System.in);
//        int a=2;
//        int b=10;
//        int c=0;
//        for(int i=1;i<=b;i++){
//            c=i*a;
//
//            System.out.println(c);
//        }
//        //System.out.println(*b);
//
//    }
//        int i=1;
//        int b=2;
//        int c=0;
//        while (i<=10){
//            c=i*b;
//            System.out.println(c);
//            i=i+1;
//        }


//

        }
    }



