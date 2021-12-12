package br.edu.infnet.appvendas.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appvendas.model.exceptions.PotenciaNegativoException;

@Entity
@Table(name = "Eletroportatil")
public class Eletroportatil extends Produto {
	
	private float potencia;
	private String cor;
	private boolean garantia;
	
	public Eletroportatil() {
		
	}

	public Eletroportatil(String nome, float preco, String marca) {
		super(nome, preco, marca);
	}

	@Override
	public float somarPrecos() {
		return getPreco() + (garantia ? 20 : 0) + 0.50f * potencia;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(); 
		
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(potencia);
		sb.append(";");
		sb.append(cor);
		sb.append(";");
		sb.append(garantia? "2" : "0");
		sb.append(";");
		sb.append (somarPrecos());

		return sb.toString();
	}
	
	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) throws PotenciaNegativoException {
		
		if(potencia <= 0){
			
			throw new PotenciaNegativoException("Não pode ser possivel fazer o calculo do valor sem ter uma potencia");
		}
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getGarantia() {
		return garantia;
	}

	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}
	
	

}
