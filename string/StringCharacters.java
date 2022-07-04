package string;
//Java Program to count the total number of characters in a string

public class StringCharacters {
    String str;
    public void display(String s){
        for(int i=s.length()-1;i>=0;i--){
           str= String.valueOf(s.charAt(i));
            System.out.print(str);
        }
    }
    public static void main(String[] args) {

StringCharacters sc=new StringCharacters();
sc.display("manish");








    }
}
