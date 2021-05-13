package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowCredentials = "false",allowedHeaders = "*",origins = "*")
@RestController
public class Controller {

    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @PostMapping("save")
    public void save(@RequestBody Bilet15 bilet15) {
        repository.save(bilet15);
    }
}