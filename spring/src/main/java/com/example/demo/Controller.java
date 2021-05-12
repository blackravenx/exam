package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String lessThan5000(Model model) {
        model.addAttribute("pokupki", repository.findAllByCostLessThan(5000.0));
        return "page";
    }
}