package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 12, 14, 16, 17, 19, 20, 24, 28};
        int search = 12;
        int li = 0;
        int hi = array.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (array[mi] == search) {

                System.out.println(mi);
                break;
            } else if (array[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if(li>hi){
            System.out.println("element not found");
        }
    }
}
