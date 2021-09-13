package com.oefening.SOAP;



import com.oefening.SOAP.models.Person;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonSOAPRepository {

    private static final Map<String, Person> persons = new HashMap<>();

    @PostConstruct
    public void initData(){
        Person person = new Person();
        person.setName("Max");
        person.setAge(21);
        person.setEmail("soap@gmail.com");

        Person person2 = new Person();
        person.setName("Bas");
        person.setAge(55);
        person.setEmail("bas@gmail.com");

        persons.put(person.getName(),person);
        persons.put(person2.getName(), person2);
    }

    public Person findPerson(String name){
        return persons.get(name);
    }
}
