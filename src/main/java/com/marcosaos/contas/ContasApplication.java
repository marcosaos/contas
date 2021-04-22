package com.marcosaos.contas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcosaos.contas.domain.Categoria;
import com.marcosaos.contas.repositories.CategoriaRepository;

@SpringBootApplication
public class ContasApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ContasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Empréstimo", 0, "Ativo", 10);
		Categoria cat2 = new Categoria(null, "Saúde", 0, "Ativo", 20);
		Categoria cat3 = new Categoria(null, "Dentista", 2, "Ativo", 20);
		Categoria cat4 = new Categoria(null, "Médico", 2, "Ativo", 20);
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
	}

}
