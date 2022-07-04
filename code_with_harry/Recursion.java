package code_with_harry;

public class Recursion {

        static void fun2(int n){
             if(n==0)
               return;
             else
                 fun2(n-1);
                     System.out.println(n);

}




        public static void main(String[] args){


           fun2(3);
        }
    }


