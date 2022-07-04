package Loops;

public class Jump {

    public static void main(String[] args) {
        int step = 0;
        int jump=0;
        int [] array =new int[]{1,3,5,6,8,9};
        for(int i=1;i< array.length;i++){
          step=step+1;
          if(step==1){
              jump=array[i+1];
          }
          if(step==2){
              jump=array[i+1];
          }
        }
    }
}
