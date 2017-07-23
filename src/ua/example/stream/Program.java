package ua.example.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxura on 24.07.2017.
 */
public class Program {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Serg", 38));
        persons.add(new Person("Dasha", 7));
        persons.add(new Person("Glasha", 3));
        persons.add(new Person("Sasha", 6));
        persons.add(new Person("Anna", 18));

//        for (Person p : persons) {
//            System.out.println(p);
//        }

        // persons.stream().forEach( p -> System.out.println(p) );
//        persons.stream().
//                filter(p -> p.getAge()>=18).
//                sorted((p1, p2)->p1.getName().compareTo(p2.getName())).
//                map(p->p.getName()).
//                forEach(System.out::println);
//        }
 double avaregeAge= persons.stream().filter(p -> p.getAge() >= 18).mapToInt(p -> p.getAge()).average().getAsDouble();
    }
}
