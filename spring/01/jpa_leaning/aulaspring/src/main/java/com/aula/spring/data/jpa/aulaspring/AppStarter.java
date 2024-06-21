package com.aula.spring.data.jpa.aulaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aula.spring.data.jpa.aulaspring.jpa.entity.User;
import com.aula.spring.data.jpa.aulaspring.jpa.repository.UserJpaRepository;

import java.util.List;
import java.util.Scanner;

@Component
public class AppStarter implements CommandLineRunner {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        insertUser();
        List<User> users = userJpaRepository.filtrarPorNome("G");
        for (User u : users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        Scanner entrada = new Scanner(System.in);
        user.setName(entrada.nextLine());
        user.setUserName(entrada.nextLine());
        user.setPassword(entrada.nextLine());
        entrada.close();

        userJpaRepository.save(user);

            for(User u : userJpaRepository.findAll()) {
                System.out.println(u);
            }
    }

}
