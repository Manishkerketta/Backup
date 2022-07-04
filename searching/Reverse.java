package searching;

public class Reverse {
    public static void main(String[] args) {
        String rev = "";
        String s="manish";
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

//        for(int i=1;i<=s.length();i=i-1){
//            System.out.println(s);
        }
    }

