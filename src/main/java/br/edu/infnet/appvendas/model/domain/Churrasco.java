package br.edu.infnet.appvendas.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appvendas.model.exceptions.PesoNegativoException;



@Entity
@Table(name = "Churrasco")
public class Churrasco extends Produto {
	
	private String tempero;
	private boolean picanha;
	private float peso;
	

	public Churrasco() {
		
		
	}
	
	
	
	public Churrasco(String nome, float preco, String marca) {
		super(nome, preco, marca);
	}

	@Override
	public float somarPrecos() {
		return getPreco() + (picanha ? 2 : 0) + 0.2f * peso;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(); 
		
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(tempero);
		sb.append(";");
		sb.append(peso);
		sb.append(";");
		sb.append(picanha? "5.0f" : "0");
		sb.append(";");
		sb.append (somarPrecos());

		return sb.toString();
	}

	public String getTempero() {
		return tempero;
	}

	public void setTempero(String tempero) {
		this.tempero = tempero;
	}

	public boolean isPicanha() {
		return picanha;
	}

	public void setPicanha(boolean picanha) {
		this.picanha = picanha;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) throws PesoNegativoException {
		
		if (peso <=0 ) {
			
		throw new PesoNegativoException("Não pode ser possivel fazer o calculo do valor sem ter uma peso");
	}
		this.peso = peso;
}


}
