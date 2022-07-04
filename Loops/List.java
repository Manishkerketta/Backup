package Loops;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        l2.add("apple");
        l2.add("banana");
        l2.add("cherry");
        l2.add("Blossom");

        for(int i=0;i<l2.size();i=i+1){
            System.out.println(l2.get(i));
        }
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(4,9);
        for(int i=0;i<l1.size();i=i+1){
        System.out.println(l1.get(i));
    }}
}
