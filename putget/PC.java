package putget;

class PC {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("producer is producing" + num);
       // this.num = num;
        valueSet = false;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {

            }
            System.out.println("consumer is consuming " + num);
            valueSet = true;
            notify();
        }
    }
}
class Producers extends Thread{
    PC  pc;
    public Producers(PC pc ){
            this.pc=pc;
    }
    @Override
    public void run() {
        int i=0;
     while (true){
            pc.put(i++);
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }
    }
}
class Consumers extends Thread{

    PC pc;
    public  Consumers(PC pc){
        this.pc=pc;

    }
    @Override
    public void run() {
        while (true){
            pc.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class InterThread{
    public static void main(String[] args) {
        PC p=new PC();
       Producers producers=new Producers(p);
       Consumers consumers=new Consumers(p);
       producers.start();

       consumers.start();
    }
}
