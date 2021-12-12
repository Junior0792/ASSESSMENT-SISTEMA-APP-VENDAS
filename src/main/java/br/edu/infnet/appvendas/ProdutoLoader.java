package br.edu.infnet.appvendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.model.exceptions.PesoNegativoException;
import br.edu.infnet.appvendas.model.exceptions.QuantidadeNegativoException;
import br.edu.infnet.appvendas.service.ChurrascoService;
import br.edu.infnet.appvendas.service.UtensilioService;

@Component
@Order(3)
public class ProdutoLoader implements ApplicationRunner{

	@Autowired
	private UtensilioService utensilioService;
	@Autowired
	private ChurrascoService churrascoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);

			Utensilio prato = new Utensilio("prato", 10, "Tramontina");		
			prato.setInox(true);
			prato.setCor("amarela");
			prato.setQuantidade(10);
			prato.setUsuario(usuario);
			utensilioService.incluir(prato);
			
			Churrasco frango = new Churrasco("frango", 60, "korin");
			frango.setPicanha(false);
			frango.setPeso(300);
			frango.setTempero("Chimichurri");
			frango.setUsuario(usuario);
			churrascoService.incluir(frango);

		} catch (PesoNegativoException | QuantidadeNegativoException e) {
			System.out.println(e.getMessage());
		}
	}
}
