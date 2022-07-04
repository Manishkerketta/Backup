package code_with_harry;

public class LargerArray {
    public static void main(String[] args) {
        int[] a = new int[]{25, 11, 7, 75, 56};
        // int i = 0;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max=a[i];
            }


        }
        System.out.println(max);
    }
}
