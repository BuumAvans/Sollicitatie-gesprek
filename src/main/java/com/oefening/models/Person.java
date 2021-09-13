package com.oefening.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false, unique = true)
    String name;

    @Column(nullable = false, unique = false)
    int age;

    @Column(nullable = false, unique = false)
    Date birthday;
}
