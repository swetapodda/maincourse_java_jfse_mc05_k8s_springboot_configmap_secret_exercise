package com.stackroute.sbservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
    @Id
    String email;
    String name;
    int    age;

    public Person(String email, String name, int age) {
        this.email = email;
        this.name  = name;
        this.age   = age;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String toString() {
        return "Person Email: "+email+" Name: "+name+" age: "+age;
    }
}