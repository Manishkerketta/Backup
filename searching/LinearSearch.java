package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] num={5,4,3,2,1,2};
        int q=2;
        for(int i=0;i< num.length;i++){
            if(num[i]==q){
                System.out.println(i);
            }
        }
    }
}
