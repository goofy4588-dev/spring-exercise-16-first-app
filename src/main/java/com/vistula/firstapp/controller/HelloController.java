package com.vistula.firstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from my first Spring app!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}