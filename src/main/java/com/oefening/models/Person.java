package com.oefening.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false, unique = false)
    @NotNull(message = "Name cannot be empty")
    String name;

    @Column(nullable = false, unique = false)
    @Min(value = 18, message = "Your age should not be lower than 18")
    @Max(value = 120, message = "Your age should not be greater than 120")
    int age;

    @Column(nullable = false)
    @Email(message = "Your Email should be a valid adress")
    String email;

    //@Column(nullable = false, unique = false)
    //Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //public Date getBirthday() {
        //return birthday;
    //}

    //public void setBirthday(Date birthday) {
        //this.birthday = birthday;
    //}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
