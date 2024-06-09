package com.aula.spring.data.jpa.aulaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring.data.jpa.aulaspring.model.User;

public interface UserJpaRepository extends JpaRepository<User, Integer> {

    
}
