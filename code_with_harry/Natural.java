package code_with_harry;

public class Natural {
    public int  display(int n){
        int temp=0;
       for(int i=0;i<=n;i++){
           temp=temp+i;

       }
//        System.out.println(temp);
        return temp;
    }
    public int show(int temp){
        display(temp++);
      System.out.println(temp);
        return temp;

    }
//    public int  show1(int temp){
//        show(temp++);
//        System.out.println(show(5));
//        return temp;
//    }

    public static void main(String[] args) {
        Natural natural=new Natural();
//        natural.display(5);
        natural.show(natural.display(5));
    }
}
