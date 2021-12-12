package br.edu.infnet.appvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvendas.clientes.EnderecoClientes;
import br.edu.infnet.appvendas.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoClientes enderecoClient;

	public Endereco obterEnderecoPorCep(String cep) {
		
		return enderecoClient.buscarCep(cep);
	}
}
