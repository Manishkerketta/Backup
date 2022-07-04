package Loops;

public class Framework {
    public static void main(String[] args) {
//        for(int i=0;i<=10;i++){
//            System.out.println(i+1);
//        }
        int [] marks={1,2,3,4,5};
        int length=marks.length;
        for(int i=0;i<=length;i++){
            int []output=new int[length];
           output[i]=marks[i]+1;
            System.out.println(output[i]);
        }

    }
}
