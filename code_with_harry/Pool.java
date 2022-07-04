package code_with_harry;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool extends Thread {
    private String name;
    public Pool(String name){
       this.name=name;
    }

    @Override
    public void run() {
        System.out.println("Thread Starting:" +name);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.getStackTrace();
        }
        System.out.println("*********************");
        System.out.println("Thread ended:" +name);
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Pool pool=new Pool("Thread 1");
        Pool pool1=new Pool("Thread 2");
//        pool.start();
        executorService.execute(pool);
        executorService.execute(pool1);
    }
}
