package br.edu.infnet.appvendas.model.domain;

import br.edu.infnet.appvendas.model.exceptions.PotenciaNegativoException;

public class Eletroportatil extends Produto {
	
	private float potencia;
	private String cor;
	private boolean garantia;

	public Eletroportatil(String nome, float preço, String marca) {
		super(nome, preço, marca);
	}

	@Override
	public float somarPreços() {
		return getPreço() + (garantia ? 20 : 0) + 0.50f * potencia;
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
		sb.append (somarPreços());

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

	public boolean getGarantía() {
		return garantia;
	}

	public void setGarantía(boolean garantia) {
		this.garantia = garantia;
	}
	
	

}
