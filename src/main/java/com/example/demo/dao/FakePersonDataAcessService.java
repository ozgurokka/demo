package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAcessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person p) {
        DB.add(p);
        return 1;
    }

    @Override
    public List<Person> getAllPerson() {
        return DB;
    }


}
