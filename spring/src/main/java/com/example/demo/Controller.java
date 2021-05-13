package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "*")
@RestController
public class Controller {

    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public void save(@RequestBody Bilet17 bilet17) {
        repository.save(bilet17);
    }
    @GetMapping("/data")
    public List<Bilet17> get() {
        return repository.findAll();
    }
}