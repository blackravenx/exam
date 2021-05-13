package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("form")
    public String template(Model model,@ModelAttribute("data") Form form) {
        model.addAttribute("form",repository.findAll());
        return "form";
    }

    @PostMapping("save_form")
    public String save(@ModelAttribute("data") Form form) {
        repository.save(form);
//        redirect чтобы нас с адреса /save_form перенаправило на адрес /form
        return "redirect:/form";
    }
}
