package com.example.postgresqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresqldemo.model.Person;
import com.example.postgresqldemo.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person> getPersonDetails() {
        return  personRepository.findAll();
    }

    public Person savePersondetails(Person person) {

        return personRepository.save(person);
    }
}
