import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Human person = new Human("Jhon", "Petrov", 35);
        Human person1 = new Human("Jhon", "Petrov", 40);
        Human person2= new Human("Jhon", "Petrov", 42);
        Set<Human> set = new HashSet();
        set.add(person);
        set.add(person1);
        set.add(person2);
        System.out.println("set" + set);


        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person.equals(person1));
        ArrayList<String> list = new ArrayList<>();
        list.add("asffffffd");
        list.add("afvbsd");
        list.add("asebbbbbbbbbbbbbbbbfsd");
        list.add("agsggssd");
        System.out.println(list);

        list.forEach(item -> {
            System.out.println("forEach " + item);
        });
        System.out.println();
        for (String item : list) {
            System.out.println("for " + item);
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for " + list.get(i));
        }
        System.out.println();
        int max = 0;
        String maximum = list.get(0);
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maximum = list.get(i);

            }

        }
        System.out.println(maximum);


    }

}


