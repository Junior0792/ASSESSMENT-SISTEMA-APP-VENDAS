package br.edu.infnet.appvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.service.ChurrascoService;

@Controller
public class ChurrascoController {

	@Autowired
	private ChurrascoService churrascoService;

	@GetMapping(value = "/churrasco")
	public String telaCadastro() {
		return "churrasco/cadastro";
	}
	
	@GetMapping(value = "/churrascos")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaChurrasco", churrascoService.obterLista(usuario));
		
		return "churrasco/lista";
	}

	@PostMapping(value = "/churrasco/incluir")
	public String incluir(Model model, Churrasco churrasco, @SessionAttribute("user") Usuario usuario) {
		
		churrasco.setUsuario(usuario);
		
		churrascoService.incluir(churrasco);

		model.addAttribute("nome", churrasco.getNome());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/churrasco/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		churrascoService.excluir(id);

		return "redirect:/churrasco";
	}
}
