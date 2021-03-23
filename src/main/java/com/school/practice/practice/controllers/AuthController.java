package com.school.practice.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/school")
public class AuthController {
    @GetMapping(value = "name", produces = "text/plain")
    public String getResult(){
        return "Hahahahhaahhahah";
    }


    @GetMapping(value = "response", produces = "text/plain")
    public String getResponse(){
        return "I am Muhammed";
    }

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public String modelView(){
        return "index";
    }
}
