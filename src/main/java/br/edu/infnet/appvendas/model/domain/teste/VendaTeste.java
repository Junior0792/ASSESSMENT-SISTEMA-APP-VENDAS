package br.edu.infnet.appvendas.model.domain.teste;

import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Cliente;
import br.edu.infnet.appvendas.model.domain.Eletroportatil;
import br.edu.infnet.appvendas.model.domain.Produto;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.model.domain.Venda;
import br.edu.infnet.appvendas.model.exceptions.PesoNegativoException;
import br.edu.infnet.appvendas.model.exceptions.PotenciaNegativoException;
import br.edu.infnet.appvendas.model.exceptions.QuantidadeNegativoException;

import java.util.ArrayList;
import java.util.List;

public class VendaTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Polly", "polly@gmail.com", "846728686-50");
		
		List<Produto> listaUtensilios = new ArrayList<Produto>();
		
		List<Produto> listaEletroportatil = new ArrayList<Produto>();
		
		List<Produto> listaChurrasco = new ArrayList<Produto>();
		
		Utensilio panela = new Utensilio("Panela", 120, "Tramontina");
		
		try {
			panela.setQuantidade(10);
			panela.setCor("Preta");
			panela.setInox(false);
			listaUtensilios.add(panela);
		}catch (QuantidadeNegativoException e) {
			System.out.println(e.getMessage());
		}
		
		Utensilio prato = new Utensilio("Prato", 20, "Tramontina");
		
		try{
			prato.setQuantidade(10);
			prato.setCor("amarelo");
			prato.setInox(false);
			listaUtensilios.add(prato);
		}catch (QuantidadeNegativoException e) {
			System.out.println(e.getMessage());
		}
		
        Eletroportatil microonda = new Eletroportatil("Microonda", 500, "Eletrolux");
        
		try {
			microonda.setCor("Branca");
			microonda.setPotencia(50);
			microonda.setGarantía(false);
			listaEletroportatil.add(microonda);
		} catch (PotenciaNegativoException e) {
			System.out.println(e.getMessage());	
		}
		
        Eletroportatil arcondicionado = new Eletroportatil("arcondicionado", 500, "Eletrolux");
        
        try {
			arcondicionado.setPotencia(90);
	        arcondicionado.setCor("azul");
	        arcondicionado.setGarantía(false);
			listaEletroportatil.add(arcondicionado);
		} catch (PotenciaNegativoException e) {
			System.out.println(e.getMessage());	
		}	
		
        Churrasco frango = new Churrasco("Frango", 60, "Korin");
        
		try {
			frango.setPeso(500);
			frango.setPicanha(false);
			frango.setTempero("Chimichurri");
			listaChurrasco.add(frango);
		} catch (PesoNegativoException e) {
			System.out.println(e.getMessage());	
		}
		
		Churrasco molho = new Churrasco("Molho", 60, "Spicee");
		try {
			molho.setPeso(500);
			molho.setPicanha(false);
			molho.setTempero("Pimenta");
			listaChurrasco.add(molho);
		} catch (PesoNegativoException e) {
			System.out.println(e.getMessage());	
		}
		
		Venda utensilios = new Venda();
		utensilios.setInformacao("Utensilios de cozinha ");
		utensilios.setCliente(cliente);
		utensilios.setDesconto(false);
		utensilios.setProdutos(listaUtensilios);
		System.out.println(utensilios);
		
		Venda Eletroportatil = new Venda();
		Eletroportatil.setInformacao("Eletroportatil ");
		Eletroportatil.setCliente(cliente);
		Eletroportatil.setDesconto(true);
		Eletroportatil.setProdutos(listaEletroportatil);
		System.out.println(Eletroportatil);
		
		Venda Churrasco = new Venda();
		Churrasco.setInformacao("Ingredientes de churrasco ");
		Churrasco.setCliente(cliente);
		Churrasco.setDesconto(true);
		Churrasco.setProdutos(listaEletroportatil);
		System.out.println(Churrasco);

		}


}
	

