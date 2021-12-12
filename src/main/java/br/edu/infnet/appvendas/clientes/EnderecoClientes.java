package br.edu.infnet.appvendas.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appvendas.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface EnderecoClientes {

	@GetMapping(value = "/{cep}/json")
	public Endereco buscarCep(@PathVariable String cep);
}
