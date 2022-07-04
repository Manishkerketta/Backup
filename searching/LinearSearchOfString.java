package searching;

public class LinearSearchOfString {
    public static void main(String[] args) {
        String [] arr={"SPIDER","MAN","N0","WAY","HOME"};
        String item="HOME";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("String name is in index" +i+" of String Array");
            }
        }
    }
}
