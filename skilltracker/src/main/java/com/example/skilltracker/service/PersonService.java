package com.example.skilltracker.service;

import java.util.List;

import com.example.skilltracker.entity.Person;


public interface PersonService {
    List<Person> getAllPersons();
    Person getPersonById(Long personId);
    Person createPerson(Person person);
    Person updatePerson(Long personId, Person personDetails);
    void deletePerson(Long personId);
}


