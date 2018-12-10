package se.akarienta.learnspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.akarienta.learnspring.model.PersonModel;
import se.akarienta.learnspring.repository.PersonRepository;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository repository;

    @RequestMapping("/findbylastname")
    public List<PersonModel> fetchDataByLastName(@RequestParam(value="lastname") String lastName) {
        return repository.findByLastName(lastName);
    }

    @RequestMapping("/all")
    public Iterable<PersonModel> fetchAll() {
        return repository.findAll();
    }
}