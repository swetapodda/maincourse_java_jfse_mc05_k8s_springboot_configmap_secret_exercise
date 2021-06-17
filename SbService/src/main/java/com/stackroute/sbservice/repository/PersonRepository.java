package com.stackroute.sbservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.sbservice.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{

}
