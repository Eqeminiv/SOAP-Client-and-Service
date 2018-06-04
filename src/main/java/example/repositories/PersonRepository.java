package example.repositories;

import example.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    public static List<Person> personList;

    public PersonRepository()
    {
        personList = new ArrayList<Person>();
        personList.add(new Person("Blazej", "Studzinski", 1));
        personList.add(new Person("Marlena", "Studzinska", 2));
        personList.add(new Person("Karyna", "Studzinska", 3));
    }
}
