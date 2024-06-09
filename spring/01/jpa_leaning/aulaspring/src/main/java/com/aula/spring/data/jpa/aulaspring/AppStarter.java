package com.aula.spring.data.jpa.aulaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aula.spring.data.jpa.aulaspring.model.User;
import com.aula.spring.data.jpa.aulaspring.repository.UserJpaRepository;

@Component
public class AppStarter implements CommandLineRunner {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public void run(String... args){

        User user = new User();
        user.setName("Gustavo");
        user.setUserName("G.7");
        user.setPassword("Blacktailwins1234");

        userJpaRepository.save(user);

        for (User u : userJpaRepository.findAll()){
            System.out.println(u);
        }

    }

}
