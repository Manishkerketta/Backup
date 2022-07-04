package Loops;

class Mobile {
   // int specification;
   // String name;
    public void Specification(){
        System.out.println(12345);
    }
    public void Name(){
        System.out.println("redmi");
    }

    public static void main(String[] args) {
      //  Mobile m1=new Mobile();

        smartphone s1=new smartphone();
        s1.smartSpecs();
        s1.Specification();
    }
}
class smartphone extends Mobile{
    public void smartSpecs(){

        System.out.println(54321);
    }
    public void smartName(){
        System.out.println("realme");
    }
}
