package br.edu.infnet.appvendas.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appvendas.model.exceptions.QuantidadeNegativoException;

@Entity
@Table(name = "Utensilio")
public class Utensilio extends Produto {

	private float quantidade;
	private String cor;
	private boolean inox;
	
	public Utensilio() {
		
	}

	
	public Utensilio(String nome, float preco, String marca) {
		super(nome, preco, marca);
	}

	

	@Override
	public float somarPrecos() {
		
		return getPreco() + (inox ? 7 : 0) + 0.10f * quantidade;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(); 
		
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(quantidade);
		sb.append(";");
		sb.append(cor);
		sb.append(";");
		sb.append(inox);
		sb.append(";");
		sb.append (somarPrecos());

		return sb.toString();
	}
	
	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) throws QuantidadeNegativoException {
		
		if(quantidade <=0 ) {
			throw new QuantidadeNegativoException("Não pode ser possivel fazer o calculo do valor sem ter uma quantidade");
		}
		
		this.quantidade = quantidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isInox() {
		return inox;
	}

	public void setInox(boolean inox) {
		this.inox = inox;
	}

	
	
}



