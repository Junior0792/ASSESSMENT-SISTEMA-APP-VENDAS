package br.edu.infnet.appvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appvendas.model.domain.Eletroportatil;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.service.EletroportatilService;

@Controller
public class EletroportatilController {

	@Autowired
	private EletroportatilService eletroportatilService;

	@GetMapping(value = "/eletroportatil")
	public String telaCadastro() {
		return "eletroportatil/cadastro";
	}
	
	@GetMapping(value = "/eletroportateis")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaEletroportatil", eletroportatilService.obterLista(usuario));
		
		return "eletroportatil/lista";
	}

	@PostMapping(value = "/eletroportatil/incluir")
	public String incluir(Model model, Eletroportatil eletroportatil, @SessionAttribute("user") Usuario usuario) {
		
		eletroportatil.setUsuario(usuario);
		
		eletroportatilService.incluir(eletroportatil);

		model.addAttribute("nome", eletroportatil.getNome());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/eletroportatil/{id}/excluir")
public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		try {
			eletroportatilService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste eletroportatil!!!");
		}

		return this.telaLista(model, usuario);
	}
}
