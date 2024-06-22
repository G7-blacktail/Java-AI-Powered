package com.aula.spring.data.jpa.aulaspring.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class WelcomeController {
    
    @GetMapping
    public String welcome() {
        return "Bem vindo ao spring boot rest API";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users() {
        return "Authorized user";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')")
    public String managers() {
        return "Authorized manager";
    }
    
}
