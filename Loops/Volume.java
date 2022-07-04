package Loops;

public class Volume {
    public static void main(String[] args) {
Box b=new Box(5,5,5);

        System.out.println(b.volume);
    }
}
class Box{

    public int volume;
            Box(int length,int breadth,int height){
        this.volume=(length*breadth*height );
    }
}
