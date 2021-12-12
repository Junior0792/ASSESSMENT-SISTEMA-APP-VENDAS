package br.edu.infnet.appvendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvendas.model.domain.Endereco;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco endereco = new Endereco();
		endereco.setBairro("Itaparica");
		endereco.setCep("123123123");
		endereco.setComplemento("Apartamento 666 Bloco A");
		endereco.setLocalidade("Vila Velha");
		endereco.setLogradouro("Rua Afonso Ferreira");
		endereco.setUf("ES");
		
		Usuario usuario = new Usuario();
		usuario.setEmail("junior.aranguren@al.infnet.edu.br.com");
		usuario.setNome("Junior Roso");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
	}
}
