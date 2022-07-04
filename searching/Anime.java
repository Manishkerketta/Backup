package searching;

import java.util.ArrayList;

public class Anime {

    int id;
    String name;
    double salary;

    public Anime(int id,String name,double salary){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    public String toString()
    {
        return id+" "+name+" "+salary;

    }


    public static void main(String[] args) {
        Anime a=new Anime(1,"john",1000);
        Anime a1=new Anime(2,"cena",2000);
        Anime a2=new Anime(3,"roman",3000);
        Anime a3=new Anime(4,"reigns",4000);
        ArrayList<Anime> s=new ArrayList<>();
        s.add(a);
        s.add(a1);
        s.add(a2);
        s.add(a3);
        System.out.println(s);

    }
}
