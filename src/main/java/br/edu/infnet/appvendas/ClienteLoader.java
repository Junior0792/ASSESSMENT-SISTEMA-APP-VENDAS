package br.edu.infnet.appvendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvendas.model.domain.Cliente;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.service.ClienteService;

@Component
@Order(2)
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Cliente cliente = new Cliente("Marialuz", "123456111-13", "marialuz@gmail.com");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
	
	}
}
