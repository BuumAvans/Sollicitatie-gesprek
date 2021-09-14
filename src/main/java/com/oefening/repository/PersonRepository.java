package com.oefening.repository;

import com.oefening.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonByName(String name);
    Boolean existsByEmail(String email);
    Person findPersonById(Long id);
}
