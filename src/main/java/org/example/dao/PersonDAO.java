package org.example.dao;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private  int count;

    {
        people = new ArrayList<>();
        people.add(new Person(++count, "Tom"));
        people.add(new Person(++count, "Bob"));
        people.add(new Person(++count, "Mike"));
        people.add(new Person(++count, "Frank"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person->person.getId() == id).findAny().orElse(null);
    }
}
