package com.gmala.magazator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class home {

    @GetMapping("/login")
    public ModelAndView home() {


        return new ModelAndView("home");
    }

    @PostMapping("/login")
    public ModelAndView login() {
        System.out.println("dfdfdf");

        return new ModelAndView("loggedin");
    }


    @GetMapping("/loggedIn")
    public ModelAndView logged() {
        return new ModelAndView("loggedin");
    }

}
