package code_with_harry;

public class Sorts {
    public static void show() {
        int [] arr = new int [] {1,0,1,1,0};
        int temp = 0;
        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        int [] arr=new int[] {6,4,1,3,2};
//
//       // int [] a=new int [arr.length];
//        System.out.println("original array");
//
////        for (int a:arr
////             ) {
////            System.out.print( " " +a);
////        }
//        int temp=0;
//
//        for(int i=0;i< arr.length;i++){
//            for(int j=i+1;i< arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                     arr[j]=temp;
//
//
//                }
//
//            }
//        }
//        System.out.println("Sorted array");
//
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//
//    }

    }

    public static void main(String[] args) {
           Sorts.show();
    }
}
