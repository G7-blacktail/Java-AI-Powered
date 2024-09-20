package com.gustavo.leaning.designpatterns.design_patterns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gustavo.leaning.designpatterns.design_patterns.model.Endereco;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author Gustavo
 */

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
