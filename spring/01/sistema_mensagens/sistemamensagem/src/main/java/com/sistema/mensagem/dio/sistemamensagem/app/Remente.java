package com.sistema.mensagem.dio.sistemamensagem.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remente {
    
    private String nome;

    private String email;

    private List<String> telefones;

    public Remente(){}


    public String getNome(){
       return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
      return  this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public List<String> getTelefones(){
        return this.telefones;
    }

    public void setTelefones(List<String> telefones){
        this.telefones = telefones;
    }
}