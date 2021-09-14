package com.oefening.service;

import com.oefening.models.Person;
import com.oefening.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     * This method returns a person when the correct name has
     * been given. This method uses the PersonRepository to get
     * the Person from the database.
     *
     *
     * @return
     *     possible object is
     *     {@link Person }
     *
     */
    public Person getPerson(String name){
        System.out.println("Service person name = " + name);
        return personRepository.findPersonByName(name);
    }

    /**
     * This method saves a person into the database
     */
    public void registerPerson(Person person){
        personRepository.save(person);
    }
}
