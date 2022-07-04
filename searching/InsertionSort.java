package searching;

public class InsertionSort {
    public static void main(String[] args) {

int temp,j;
        int array[] ={1,11,9, 5, 7, 4};
        for(int i=1;i< array.length;i++){
           temp=array[i];
           j=i;
           while(j>0 && array[j-1]>temp){
               array[j]=array[j-1];
               j=j-1;
           }
           array[j]=temp;
        }
        for (int arr:array
             ) {
            System.out.println(arr);

        }

    }
}
