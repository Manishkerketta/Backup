package Factory;

public class FactoryMain {
    public static void main(String[] args) {
OperatingSystemFactory osf=new OperatingSystemFactory();
OS object=osf.getSpecs("better");
object.specs();
//obj.getSpecs("best");
//obj.getSpecs("good");


    }
}
