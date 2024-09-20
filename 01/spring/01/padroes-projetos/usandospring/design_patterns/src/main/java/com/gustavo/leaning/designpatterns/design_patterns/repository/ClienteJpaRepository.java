package com.gustavo.leaning.designpatterns.design_patterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.leaning.designpatterns.design_patterns.model.Cliente;

@Repository
public interface ClienteJpaRepository extends CrudRepository<Cliente, Long> {
    
}
