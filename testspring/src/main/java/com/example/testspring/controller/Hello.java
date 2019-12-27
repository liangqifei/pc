package com.example.testspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value="spring",method= RequestMethod.GET)
    public String index(){
        return "spring";
    }
}

