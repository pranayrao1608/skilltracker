package com.example.skilltracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.skilltracker.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
     

}
