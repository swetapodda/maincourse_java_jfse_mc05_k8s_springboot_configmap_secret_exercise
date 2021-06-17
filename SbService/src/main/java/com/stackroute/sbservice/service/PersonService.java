package com.stackroute.sbservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.sbservice.model.Person;
import com.stackroute.sbservice.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    //Create operation
    public Person create(String email,String name, int age) {
        return personRepository.save(new Person(email, name, age));
    }
    //Retrieve operation
    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
