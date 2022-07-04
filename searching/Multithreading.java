package searching;

public class Multithreading extends Thread{
    public static void main(String[] args) {
        int a=10+20;
        System.out.println(a);
        Thread t=Thread.currentThread();
        String t1=t.getName();
        System.out.println(t1);
        t.setName("manish");
        System.out.println(t.getName());
    }
//
//    public void run() {
//
//        for(int i=1;i<=10;i++){
//            System.out.println("start");
//            System.out.println("value is "+i);
//            try{
//
//                Thread.sleep(1000);
//
//            } catch
//            (InterruptedException e) {
//                System.out.println(e);
//
//
//            }
//            System.out.println("after one second");
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Multithreading m=new Multithreading();
//        Thread t=new Thread(m);
//        t.start();
//        t.getId();
//    }
//
}
