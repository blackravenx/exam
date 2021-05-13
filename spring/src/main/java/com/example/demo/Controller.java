package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//для REST API надо использовать @RestController
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
//    GET метод
    public List<Bilet13> rest_get() {
        return repository.findAll();
    }
}