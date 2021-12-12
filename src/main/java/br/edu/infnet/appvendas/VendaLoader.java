package br.edu.infnet.appvendas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Cliente;
import br.edu.infnet.appvendas.model.domain.Produto;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.model.domain.Venda;
import br.edu.infnet.appvendas.service.VendaService;

@Component
@Order(4)
public class VendaLoader implements ApplicationRunner {

	@Autowired
	private VendaService vendaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Utensilio prato = new Utensilio("Prato", 10, "Tramontina");		
		prato.setId(1);
		
		Churrasco frango = new Churrasco("Frango", 60, "Korin");		
		frango.setId(2);

		Cliente cliente = new Cliente();
		cliente.setId(1);
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(prato);
		listaProdutos.add(frango);
				
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Venda venda = new Venda();
		venda.setInformacao("Pedido Principal Loader");
		venda.setProdutos(listaProdutos);
		venda.setCliente(cliente);
		venda.setUsuario(usuario);
		venda.setDesconto(true);
		
		vendaService.incluir(venda);
	}

	
}
