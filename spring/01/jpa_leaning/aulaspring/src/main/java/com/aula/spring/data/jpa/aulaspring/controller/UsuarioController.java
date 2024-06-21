package com.aula.spring.data.jpa.aulaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aula.spring.data.jpa.aulaspring.jpa.repository.UserRepository;
import com.aula.spring.data.jpa.aulaspring.model.Usuario;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<Usuario> getUsers(){
      return this.userRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOneUser(@PathVariable("username") String username){
        return this.userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
         this.userRepository.findById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        userRepository.save(usuario);
    }
}
