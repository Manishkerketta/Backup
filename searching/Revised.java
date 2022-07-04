package searching;
import java.util.*;
public class Revised {
    public static void main(String[] args) {
        //int []  marks=new int[3];
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }


    }

        //ArrayList<String> names=new ArrayList();

//        names.add("manish");
//        names.add("manashi");
//        names.add("manoranjan");
//        names.add("kamal");
//        System.out.println(names);
//        System.out.println(names.get(1));
//        Vector<String> v=new Vector();
//        v.addAll(names);
//        System.out.println(v);

//        HashSet<Integer> hashSet=new HashSet<>();
//        hashSet.add(12);
//        hashSet.add(13);
//        hashSet.add(9);
//        hashSet.add(8);
//        hashSet.add(7);
//        //System.out.println(hashSet);
//
//        TreeSet<Integer> treeSet=new TreeSet<>();
//        treeSet.addAll(hashSet);
//        treeSet.forEach(lambda->{
//            System.out.println(lambda);
//        });
//        HashMap<String, Integer> people = new HashMap<String, Integer>();
//
//        // Add keys and values (Name, Age)
//        people.put("John", 32);
//        people.put("Steve", 30);
//        people.put("Angie", 33);
//
//
//        for (String i:people.keySet()
//             ) {
//            System.out.println(people.get(i));
            
        }
      


