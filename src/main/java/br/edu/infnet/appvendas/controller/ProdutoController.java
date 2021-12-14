package br.edu.infnet.appvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping(value = "/produtos")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaProdutos", produtoService.obterLista(usuario));
		
		return "produto/lista";
	}

	@GetMapping(value = "/produto/{id}/excluir")
public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		try {
			produtoService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("mensagem", "Impossível realizar a exclusão deste produto!!!");
		}

		return this.telaLista(model, usuario);
	}
}
