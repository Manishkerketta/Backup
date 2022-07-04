package Loops;

public class Age {
    public int age(int age) {

        if (age < 18) {
            System.out.println("Is Not Eligible For Voting");
        } else {
            System.out.println("Is Eligible For Voting");
        }

        return age;
    }
    public String name(String name){
        return name;
    }

    public static void main(String[] args) {
        Age a=new Age();
        System.out.println(a.name("Manish"));
        System.out.println(a.age(19));
    }

}
