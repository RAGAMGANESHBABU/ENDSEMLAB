package com.klef.jfsd.exam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "test";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/showInfo")
    public String showInfo(@RequestParam int id, @RequestParam String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @GetMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", "Sum: " + sum);
        return "result";
    }

    @GetMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", "Addition Result: " + sum);
        return "result";
    }

    @GetMapping("/combine")
    public String combine(@RequestParam String str1, @RequestParam String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("result", "Combined String: " + combined);
        return "result";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("result", "Sum: " + sum + ", Product: " + product);
        return "result";
    }
}

