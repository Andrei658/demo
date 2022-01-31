package com.example.demo.controller;


import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@CrossOrigin("*") // http://localhost:3000/
public class PersonController {

    @Autowired
    private PersonService service;


    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return service.getAllPersons();
    }
    @PostMapping("/add")
    public String addPerson(@RequestBody Person person) {
        service.addPerson(person);

        ;;;;;;
        return "Am adaugat user-ul cu succes!";
    }
}


