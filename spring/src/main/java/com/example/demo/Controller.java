package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    final
    Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    //Здесь например, при обращении к адресу http://localhost:8080/Vanya
//    нам в HTML  выведет информацию из табилцы Bilet13 где есть строка name "Vanya"

    @GetMapping("/{name}")
    public String findByName(Model model, @PathVariable String name) {
        model.addAttribute("all", repository.findAll());
        model.addAttribute("find_by_name", repository.findByName(name));
        return "page";
    }
}