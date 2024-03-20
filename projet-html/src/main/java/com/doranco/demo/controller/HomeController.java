package com.doranco.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private static final String[] articles = { "titre 1", "titre 2" };

    @GetMapping("/article/{index}")
    public String home(@PathVariable int index, Model model) {
        model.addAttribute("title", articles[index]);
        return "index";
    }

}
