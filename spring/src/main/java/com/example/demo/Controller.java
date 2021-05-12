package com.example.demo;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.stereotype.Controller
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    //    CRUD update
    @PatchMapping("/update/{id}")
    public String update(@PathVariable Integer id, Bilet3 bilet3) {
        if (repository.existsById(id)) {
            repository.save(bilet3);
            return "page";
        }
        else
        {
            return "page";
        }
    }
}
