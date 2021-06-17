package com.stackroute.sbservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.sbservice.model.Person;
import com.stackroute.sbservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
public class PersonController {
    @Value("${sb.k8.message}")
    private String message;

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/message/{user}")
    public String greet(@PathVariable("user") String user) {
        // Getting the message stored in config map by environment name 'GREETING'
        String configMapMessage = System.getenv().getOrDefault("GREETING","Hey ");
        return message+configMapMessage+user;
    }

    @RequestMapping("/create")
    public String create(@RequestParam String email, @RequestParam String name, @RequestParam int age) {
        Person person = personService.create(email, name, age);
        return person.toString();
    }

    @RequestMapping("/getAll")
    public List<Person> getAll(){
        return personService.getAll();
    }
}