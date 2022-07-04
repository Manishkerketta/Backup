package Practice;

import searching.Data;

public class Char {
    public static void main(String[] args) {



//initializing an array
        int a[]={38,52,9,18,6,62,13};
        int min, temp =0;
        for (int i = 0; i < a.length; i++)

        {
            min=i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    min=j;
                    temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
//accessing element of the array
//        for (int i = 0; i <=a.length - 1; i++)
//        {
//        a    System.out.println(a[i]);
//        }
        for (int x:a
             ) {
            System.out.print(x+ " ");

        }
//
//     //   char a='\u260E';
////        int x=10;
////        short a=(short) x;
////        System.out.println(a);
////    }
//      String [] s={"manish","ganesh","steve","rogers"};
//       // Char c=new Char();
//
//       // c.display(s);
//        for (String s1:s
//             ) {
//            System.out.println(s.);
//
//        }
//
//}
////public void display(String[] s){
////        // s[0] ="roman";
////    for (String s1:s
////         ) {
////        System.out.println(s1);
////
////    }
//
//}
//
//
    }
}