package com.oefening.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false, unique = true)
    String name;

    @Column(nullable = false, unique = false)
    int age;

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
}
