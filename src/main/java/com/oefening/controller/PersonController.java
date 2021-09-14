package com.oefening.controller;

import com.oefening.models.Person;
import com.oefening.service.PersonService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "Person")
@RestController
@RequestMapping(path = "/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    /**
     * This method returns a person when the correct name has
     * been given. The name needs to be given in the Path Variable as
     * a String.
     *
     * @return
     *     possible object is
     *     {@link Person }
     *
     */
    @GetMapping("/find/{name}")
    public Person getPerson(@PathVariable String name){
        return personService.getPerson(name);
    }

    /**
     * This method registers a given Person into the database
     *
     *
     *
     * @return
     *     possible object is
     *     {@link Person }
     *
     */
    @PostMapping("/register")
    public ResponseEntity<String> registerPerson(@Valid @RequestBody Person person){
         personService.registerPerson(person);
         return ResponseEntity.ok("Person is valid");
    }

    /**
     * This method deletes a person from the database
     */
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }
}
