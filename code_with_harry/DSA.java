package code_with_harry;

import java.time.LocalDate;
import java.util.Locale;

public class DSA {
    public static boolean display(String s){
          int i=0;
          int j=s.length()-1;
          while(i<j){
              if(s.charAt(i) !=s.charAt(j)){
                  return false;
              }
              else {
                  i++;
                  j--;
              }

          }
        return true;
    }
    public static void main(String[] args) {
        String s = "madam";
       // String str2 = "RACEcar";

        //Change strings to lowercase
        s = s.toLowerCase();
      //  str2 = str2.toLowerCase();

        // For string 1
        System.out.print("String 1 :");

        if (display(s))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");

//        String s="kaya";
//        s=s.toLowerCase();
//        int length=s.length();
//
//        int count=0;
//
//        String s1="";
//        for (int j=0;j<=length-1;j++) {
//            for (int i = length-1; i >= 0; i--) {
//                if(j==i){
//                    s1 = s1 + s.charAt(j);
//                    count++;
//                   // b=true;
//                }
//                else{
//
//                    break;
//                }
//
//
//
//            }
//        }
//
//
//            if(count>0){
//                System.out.println("palindrome");
//            }
//            else {
//                System.out.println("not palindrome");
//            }

        //System.out.println(s1);
//        LocalDate d=LocalDate.now();
//        LocalDate yesterday=d.minusDays(1);
//         LocalDate tomorrow=d.plusDays(1);
//        System.out.println(d+"" +"|" +yesterday+"|"+ tomorrow);
//    }
    }
}
