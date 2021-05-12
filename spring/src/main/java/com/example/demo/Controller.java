package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    //Get vue
    @GetMapping("/get")
    public Iterable<Bilet6> getVue() {
        return repository.findAll();
    }
}