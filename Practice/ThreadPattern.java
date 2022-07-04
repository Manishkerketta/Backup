package Practice;

public class ThreadPattern {
    public static void main(String[] args) {


        for(int i=1;i<=5;i++){
            for(int a=1;a<=i;a++){
                System.out.print("spiderman");
            }
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){

            }
            System.out.println(" ");
        }

    }
}
