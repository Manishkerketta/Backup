package Loops;

public class ListOfPN {
    public static void main(String[] args) {
        int a;
        int j;
        // int b=10;
        for (int i = 1; i <= 10; i++) {
            a = 0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    a=a+1;
                }
            }
            if(a==2)
            System.out.println(i);

        }
    }

}
