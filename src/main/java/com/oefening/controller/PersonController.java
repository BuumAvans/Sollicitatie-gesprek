package com.oefening.controller;

import com.oefening.models.Person;
import com.oefening.service.PersonService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "Person")
@RestController
@RequestMapping(path = "/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/find/{name}")
    public Person getPerson(@PathVariable String name){
        System.out.println("Trying to register person with name" + name);
        return personService.getPerson(name);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerPerson(@Valid @RequestBody Person person){
        System.out.println("Trying to register person with name" + person.getName());
         personService.registerPerson(person);

         return ResponseEntity.ok("Person is valid");
    }
}
