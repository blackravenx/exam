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

    //    CRUD delete
    @PatchMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "page";
        }
        else
        {
            return "page";
        }
    }
}