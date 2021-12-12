package br.edu.infnet.appvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.service.UtensilioService;

@Controller
public class UtensilioController {

	@Autowired
	private UtensilioService utensilioService;

	@GetMapping(value = "/utensilio")
	public String telaCadastro() {
		return "utensilio/cadastro";
	}
	
	@GetMapping(value = "/utensilios")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaUtensilios", utensilioService.obterLista(usuario));
		
		return "utensilio/lista";
	}

	@PostMapping(value = "/utensilio/incluir")
	public String incluir(Model model, Utensilio utensilio, @SessionAttribute("user") Usuario usuario) {
		
		utensilio.setUsuario(usuario);
		
		utensilioService.incluir(utensilio);

		model.addAttribute("nome", utensilio.getNome());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/utensilio/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		utensilioService.excluir(id);

		return "redirect:/utensilios";
	}
}
