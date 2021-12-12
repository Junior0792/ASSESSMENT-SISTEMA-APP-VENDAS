package br.edu.infnet.appvendas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appvendas.model.domain.Produto;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.domain.Venda;
import br.edu.infnet.appvendas.service.ClienteService;
import br.edu.infnet.appvendas.service.ProdutoService;
import br.edu.infnet.appvendas.service.VendaService;

@Controller
public class VendaController {

	@Autowired
	private VendaService vendaService;
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "/venda")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("produtos", produtoService.obterLista(usuario));
		
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		
		return "venda/cadastro";
	}
	
	@GetMapping(value = "/vendas")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaVendas", vendaService.obterLista(usuario));
		
		return "venda/lista";
	}

	@PostMapping(value = "/venda/incluir")
	public String incluir(Model model, Venda venda, @RequestParam String[] produtoIds, @SessionAttribute("user") Usuario usuario) {
		
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		venda.setUsuario(usuario);
		
		for(String idProduto : produtoIds) {
			
			Produto produto = produtoService.obterPorId(Integer.valueOf(idProduto));
			
			listaProduto.add(produto);
		}
		
		venda.setProdutos(listaProduto);
		
		vendaService.incluir(venda);

		model.addAttribute("informacao", venda.getInformacao());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/venda/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		vendaService.excluir(id);

		return "redirect:/vendas";
	}

}
