package com.example.deleteafter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    private PeoplerRepository peopleRepository;

    public PeopleController(PeoplerRepository peopleRepository){
        this.peopleRepository = peopleRepository;

    }
    //test people
    @GetMapping("/")
    public ResponseEntity<People> people() {
        People people = new People("Johny");
        peopleRepository.save(people);
        return new ResponseEntity<>(people, HttpStatus.OK);

    }}