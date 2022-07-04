package code_with_harry;

public class MultiThreading extends Thread {
 int total=0;
    @Override
    public void run() {
        synchronized (this) {
        for (int i =1;i<=10;i++){
            total=total+100;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println(total);
        }
        this.notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreading multiThreading=new MultiThreading();
        multiThreading.start();
       synchronized (multiThreading){
               multiThreading.wait(100);
        }
        System.out.println(multiThreading.total);
    }
}
