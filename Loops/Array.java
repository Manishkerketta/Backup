package Loops;

public class Array {
    int [] numbers=new int[]{1,2,3,4,5};

public int[] addOneToArray( ){
    int length=numbers.length;
    int [] output=new int[length];
    for(int i=0;i<length;i++){
        output[i]=numbers[i]+1;
    }
    return output;
}
    public static void main(String[] args) {

    Array a1=new Array();
        System.out.println(a1.addOneToArray());

    }
}
