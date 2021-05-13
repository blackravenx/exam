package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @PostMapping("/create")
    public void create(@RequestBody Bilet2 bilet2) {
       repository.save(bilet2);
    }
}
