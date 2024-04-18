package ru.gb.example3_sem4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class RandomNumber {
    Random random = new Random();
    @GetMapping("/random")
    public String random(Model model){
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int sum = num1 + num2;
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("sum",sum);
        return "random";

    }
}
