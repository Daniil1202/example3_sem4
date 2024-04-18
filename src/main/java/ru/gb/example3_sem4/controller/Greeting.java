package ru.gb.example3_sem4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Greeting {
    @RequestMapping("/greet")
    public String hello(){
        return "greet";
    }
}
