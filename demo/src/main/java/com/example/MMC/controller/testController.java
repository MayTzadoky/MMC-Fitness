package com.example.MMC.controller;

import com.example.MMC.user.LoginInformation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class testController {
    @GetMapping("/")
    public String start(Model model){
        model.addAttribute("userForm", new LoginInformation());
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute LoginInformation user, Model model)
    {
        System.out.println(user.toString());
        model.addAttribute("userForm", new LoginInformation());
        //TODO - need to get user data from DB

        model.addAttribute("username", user.getUsername());
        model.addAttribute("age", "27");
        model.addAttribute("gender", "Male");
        model.addAttribute("weight", "98");
        model.addAttribute("height", "1.78");
        model.addAttribute("BMI", "98%");
        model.addAttribute("fatPercentage", "25%");
        model.addAttribute("weightGoal", "85");
        return "mainPageSubscriber";
    }
}
