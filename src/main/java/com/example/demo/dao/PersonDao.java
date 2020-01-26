package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person p);

    default int addPerson(Person p){
        UUID id = UUID.randomUUID();
        return insertPerson(id,p);
    }

    List<Person> getAllPerson();
}
