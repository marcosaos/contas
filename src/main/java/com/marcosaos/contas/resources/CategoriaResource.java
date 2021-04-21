package com.marcosaos.contas.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcosaos.contas.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Empréstimo", 0, "Ativo", 10);
		Categoria cat2 = new Categoria(2, "Saúde", 0, "Ativo", 20);
		Categoria cat3 = new Categoria(3, "Dentista", 2, "Ativo", 20);
		Categoria cat4 = new Categoria(4, "Médico", 2, "Ativo", 20);
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		
		return lista;
	}
}
