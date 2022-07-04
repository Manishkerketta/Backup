package searching;

import java.util.ArrayList;

public class Call{
    public static void main(String[] args) {
        ArrayList <Integer> n=new ArrayList<>();
        n.add(4);
        n.add(5);
        n.add(6);
        n.add(7);
        for(int i=0;i<n.size();i++){
            System.out.println(n.get(i));
        }
//        n.forEach((s)->{
//            System.out.println(s);
//        });
    }
}
//@FunctionalInterface
//interface Add{
//    public int specs(int a,int b);
//
//}
//interface Length{
//    public int len(String s);
//}
//
//public class Call{
//    public static void main(String[] args) {
        //int sum=10;
//        Add m=(a,b) ->{
//            return a+b;
//        };
//
//
//sum=m.specs(6,5);
//        System.out.println(sum);
//    };
//    Length l=(s -> s.length());
//        System.out.println("the length is" +l.len("manish"));







   // }
//}









