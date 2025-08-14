package com.codewithmosh.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // a bean is an object that is managed by Spring
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","Ashwin");
        return "index.html";
    }
}
