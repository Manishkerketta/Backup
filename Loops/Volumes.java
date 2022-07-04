package Loops;

public class Volumes {
    public static void main(String[] args) {
       Cylinder c=new Cylinder();

        System.out.println(c.box(5,5,5));
    }
}
class Cylinder{
   public int box(int length,int width,int height)
    {
        return length*width*height;
    }

}
