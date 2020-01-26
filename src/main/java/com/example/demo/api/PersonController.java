package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService ps;

    @Autowired
    public PersonController(PersonService ps) {
        this.ps = ps;
    }
    @PostMapping
    public void addPerson(@RequestBody Person p){
        ps.addPerson(p);
    }

    @GetMapping
    public List<Person> getAllPerson(){
        return ps.getALLPerson();
    }
}
