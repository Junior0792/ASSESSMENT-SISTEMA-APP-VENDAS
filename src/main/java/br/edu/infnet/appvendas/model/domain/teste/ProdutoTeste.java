package br.edu.infnet.appvendas.model.domain.teste;

import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Eletroportatil;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.model.exceptions.PesoNegativoException;
import br.edu.infnet.appvendas.model.exceptions.PotenciaNegativoException;
import br.edu.infnet.appvendas.model.exceptions.QuantidadeNegativoException;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		try {
			Utensilio faca = new Utensilio("Faca", 59, "Tramontina");
			faca.setCor("Preta");
			faca.setInox(false);
			faca.setQuantidade(10);
			System.out.println("Valor da compra: " + faca);
		} catch (QuantidadeNegativoException e) {
			System.out.println(e.getMessage());
		}
		

		try {
			Utensilio panela = new Utensilio("Panela", 120, "Tramontina");
			panela.setQuantidade(10);
			panela.setCor("azul");
			panela.setInox(true);
			System.out.println("valor da compra: " + panela.somarPreços());
			
		} catch (QuantidadeNegativoException e) {
			System.out.println(e.getMessage());		
			
		}
		
	    try{
			Eletroportatil lavadora = new Eletroportatil("Lavadora", 500, "Eletrolux");
			lavadora.setCor("Branca");
			lavadora.setPotencia(10);
			lavadora.setGarantía(false);
			System.out.println("Valor da compra: " + lavadora);
	    } catch (PotenciaNegativoException e) {
			System.out.println(e.getMessage());		

	    }
	    try{
			Eletroportatil geladeira = new Eletroportatil("Geladeira", 1000, "Brastemp");
			geladeira.setCor("Cinza");
			geladeira.setPotencia(10);
			geladeira.setGarantía(true);
			System.out.println("Valor da compra: " + geladeira.somarPreços());
	    } catch (PotenciaNegativoException e) {
			System.out.println(e.getMessage());		
	    }	
	    try {
			Churrasco carne = new Churrasco("Carne", 60, "Korin");
			carne.setPicanha(true);
			carne.setPeso(500);
			carne.setTempero("Chimichurri");
			System.out.println("Valor da compra: " + carne);
	    }catch (PesoNegativoException e ) {
			System.out.println(e.getMessage());		

	    }
	   try {
			Churrasco costela = new Churrasco("Costela", 55, "Korin");
			costela.setPicanha(false);
			costela.setPeso(1000);
			costela.setTempero("Pimenta do reino");
			System.out.println("Valor da compra: " + costela.somarPreços());
	   }catch (PesoNegativoException e ) {
			System.out.println(e.getMessage());	
	   }
	}

	}
