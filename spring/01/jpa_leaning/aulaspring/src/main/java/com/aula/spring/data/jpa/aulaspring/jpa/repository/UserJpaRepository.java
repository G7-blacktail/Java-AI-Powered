package com.aula.spring.data.jpa.aulaspring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aula.spring.data.jpa.aulaspring.jpa.entity.User;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<User, Integer> {

    //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByUserName(String userName);

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
    
}
