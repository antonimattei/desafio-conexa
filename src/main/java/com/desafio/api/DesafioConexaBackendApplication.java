package com.desafio.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.desafio.utils.SenhaUtils;

@SpringBootApplication
public class DesafioConexaBackendApplication {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina; {
		
	};

	public static void main(String[] args) {
		SpringApplication.run(DesafioConexaBackendApplication.class, args);
	};
	
	@Bean
	public CommandLineRunner commandLineRunner () {
		return args -> {
			String senhaEconded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha Encoded: "+ senhaEconded);
			
			senhaEconded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha Encoded Novamente: "+senhaEconded);
			
			
			System.out.println("senha válida: "+ SenhaUtils.senhaValida("123456", senhaEconded));
		};
	};
	

};
