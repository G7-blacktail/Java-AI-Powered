package com.gustavo.leaning.designpatterns.design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Seguindo o modelo apresentado aqui vou detalhar como foi construido o projeto no Initializr]
 * Os seguintes modulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 DataBase (este irei substituir pelo MariaDB mais a frente)
 * - OpenFeign
 * 
 * @author Gustavo
 */

@EnableFeignClients
@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
