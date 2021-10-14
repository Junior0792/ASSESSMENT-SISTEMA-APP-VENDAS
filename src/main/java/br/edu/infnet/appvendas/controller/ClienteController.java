package br.edu.infnet.appvendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

// Get
	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		
	return "cliente/Cadastro";	
	}

//Post
	@PostMapping(value = "/cliente/incluir")
	public String incluir() {
		
	System.out.println("O cliente foi adicionado com sucesso!");
		
	return "cliente/Cadastro";
	}
}
