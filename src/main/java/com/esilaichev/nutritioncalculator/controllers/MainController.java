package com.esilaichev.nutritioncalculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @GetMapping(value = "/main")
    public String main(Model model) {

        return "main";
    }

    @GetMapping(value = "/notmain")
    public String notmain(Model model) {

        return "main";
    }
}
