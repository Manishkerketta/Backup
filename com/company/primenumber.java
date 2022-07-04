package com.company;

 class primenumber {
     public static void main(String[] args) {
         int n=12;
         int count=0;
     for(int i=2;i<n;i++){
         if(n%2==0){
             count=count+1;
         }
     }
     if(count==0){
         System.out.println(" prime number");
     }
     else{
         System.out.println("it is not prime number");
     }
     }
 }
