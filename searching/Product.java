package searching;

public class Product {
    public String addProduct(String a){
        String name=a+ " manishproplayer";
        return name;

    }

    public static void main(String[] args) {
        Product p=new Product();
        //p.addProduct();
        System.out.println(p.addProduct("name"));
    }
}
