package code_with_harry;

public class ArmStrong {
//    int n;
//    public ArmStrong(int n){
//        this.n=n;
//    }
public int display(int n){
        int temp=0;
        int rev=0;

        int k=n;
        while (n>0){
            temp=n%10;
            rev=(temp*temp*temp)+rev;
               n=n/10;
        }
        if(k==rev){
            System.out.println("armstrong" +rev);
        }
        else {
            System.out.println("not armstrong");
        }


    return rev;
}

    public static void main(String[] args) {
        ArmStrong armStrong=new ArmStrong();
       armStrong.display(153);
    }
}
