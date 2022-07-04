package Loops;

import java.util.ArrayList;

public class Iterator<S> {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("manish");
        a.add("roman");
        a.add("paul");
        a.add("john");
        java.util.Iterator<String> i=  a.iterator();
while(i.hasNext()){
    String value=i.next();
    System.out.println(value);
    if(value.equals("paul"))
        i.remove();

}


        for (String human: a) {
            System.out.println(human);


        }



    }
}
