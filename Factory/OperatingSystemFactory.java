package Factory;

public class OperatingSystemFactory {
    public OS getSpecs(String spec){
        if(spec.equals("better"))
            return new Android();
        else if(spec.equals("best"))
            return new IOS();
        else
            return  new Windows();
    }
}






















