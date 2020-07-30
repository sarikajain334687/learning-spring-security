package com.ttalks.tls.learningspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/employee")
    public String getEmployee(){
        return "<H1>Welcome to Employees Home Page</H1>";
    }

}
