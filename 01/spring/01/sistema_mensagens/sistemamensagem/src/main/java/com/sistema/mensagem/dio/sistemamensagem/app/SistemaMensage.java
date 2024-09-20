package com.sistema.mensagem.dio.sistemamensagem.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensage implements CommandLineRunner{

    @Autowired
    private Remente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome()
        + "\nEmail: " + remetente.getEmail() + "\nTelefone: " + remetente.getTelefones());

        System.out.println("Seu cadastro foi aprovado");
    }
    
}
