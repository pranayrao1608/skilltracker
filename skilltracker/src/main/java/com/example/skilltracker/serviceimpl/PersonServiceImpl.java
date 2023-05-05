package com.example.skilltracker.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.example.skilltracker.entity.Person;
import com.example.skilltracker.repository.PersonRepository;
import com.example.skilltracker.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long personId) {
        return personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id " + personId));
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Long personId, Person personDetails) {
        Person existingPerson = personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id " + personId));

        existingPerson.setName(personDetails.getName());
        existingPerson.setEmail(personDetails.getEmail());

        return personRepository.save(existingPerson);
    }

    @Override
    public void deletePerson(Long personId) {
        personRepository.deleteById(personId);
    }
}
