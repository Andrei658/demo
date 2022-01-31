package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public void addPerson(Person person) {

        Optional<Person> personFind = repository.findPersonByEmail(person.getEmail());


        if(personFind.isPresent()) {
            throw new IllegalStateException("Exista deja o persoana cu acest email!");
        }

        repository.save(person);
    }

    public List<Person> getAllPersons() {

        return repository.findAll();
    }
}
