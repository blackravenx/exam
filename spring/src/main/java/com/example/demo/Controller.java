package com.example.demo;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(allowCredentials = "false",allowedHeaders = "*",origins = "*")
@RestController
public class Controller {

    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }
    @GetMapping("/data")
    public Iterable<Bilet16> get(){
        return repository.findAll();
    }
}