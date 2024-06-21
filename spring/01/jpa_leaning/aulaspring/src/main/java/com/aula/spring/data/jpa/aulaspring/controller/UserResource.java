package com.aula.spring.data.jpa.aulaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserResource {

    @GetMapping("/welcome")
    public String welcome() {
        return "Bem vindo ao spring boot rest API";
    }
    
}
