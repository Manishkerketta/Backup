package code_with_harry;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        int duplicate = 0;
        //int i;

        for (int i = 0; i < array.length; i++) {
            int j = 0;
            for (j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    // duplicate=array[j];
                    System.out.println(array[j]);
                }
            }
        }

    }
}
