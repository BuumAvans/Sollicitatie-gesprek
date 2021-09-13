package com.oefening.controller;

import com.oefening.models.Person;
import com.oefening.service.PersonService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@Api(value = "Person")
@RestController
@RequestMapping(path = "/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{name}")
    public Person getPerson(@PathVariable String name){
        System.out.println("Trying to register person with name" + name);

        Person person = personService.getPerson(name);

        System.out.println(person.getName());

        return personService.getPerson(name);
    }

    @PostMapping("/register")
    public void registerPerson(@RequestBody Person person){
        System.out.println("Trying to register person with name" + person.getName());
         personService.registerPerson(person);
    }
}
