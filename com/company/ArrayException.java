package com.company;

public class ArrayException {
    public static void main(String[] args) {

           int[] marks = new int[3];

           marks[0] = 10;
           marks[1] = 20;
           marks[2] = 30;


           try{
               System.out.println(marks[3]);

      }catch(Exception e) {
           System.out.println(e);
           }

        System.out.println("array size is 3 so its an exception");

        }


    }

