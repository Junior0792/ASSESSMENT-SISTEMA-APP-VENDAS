package br.edu.infnet.appvendas.model.domain.teste;

import br.edu.infnet.appvendas.model.domain.Cliente;
import br.edu.infnet.appvendas.model.domain.Venda;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ("Polly", "polly@mail.com", "654354343-20");
		
		System.out.println(cliente);
			
	}
}
