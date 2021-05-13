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

    @GetMapping("/")
    public String from_db_to_html(Model model) {
        model.addAttribute("bilet12", repository.findAll());
        return "page";
    }
}