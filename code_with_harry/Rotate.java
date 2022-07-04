package code_with_harry;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        int[] myArray =new int [] {1,2,3,4,5};
    int [] outputArray=new int[myArray.length];
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int noOfRotations= sc.nextInt();
        int rotatingPoint=noOfRotations;
        int i=0;
        while (rotatingPoint< myArray.length){
            outputArray[i]=myArray[rotatingPoint];
                i++;
            rotatingPoint=rotatingPoint+1;

        }
        rotatingPoint=0;
        while (rotatingPoint<noOfRotations){
            outputArray[i]=myArray[rotatingPoint];
            i=i+1;
            rotatingPoint=rotatingPoint+1;
        }
        System.out.println("output array is");
        for (int arrayElement: outputArray
             ) {
            System.out.print(arrayElement+" ");

        }
}}
