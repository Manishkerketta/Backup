package code_with_harry;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void display(){
        ArrayList a=new ArrayList<>();
        a.add("red");
        a.add("blue");
        a.add("green");
        a.add("yellow");
//        for (Object a1:a
//        ) {
//            Collections.reverse(a);
//        }
        Collections.reverse(a);
        System.out.println(a);


    }
    public static void main(String[] args) {
       ReverseArrayList.display();
    }
}
