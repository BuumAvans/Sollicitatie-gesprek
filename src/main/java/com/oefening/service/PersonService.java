package com.oefening.service;

import com.oefening.models.Person;
import com.oefening.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPerson(String name){
        System.out.println("Service person name = " + name);
        return personRepository.findPersonByName(name);
    }

    public void registerPerson(Person person){
        personRepository.save(person);
    }
}
