package br.edu.infnet.appvendas.model.domain;

public abstract class Produto {

	private String nome;
	private float preço;
	private String marca;


	public Produto(String nome, float preço, String marca) {
		super();
		this.nome = nome;
		this.preço = preço;
		this.marca = marca;
	}
	
	public float somarPreços() {
		
		return 50;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(preço);
		sb.append(";");
		sb.append(marca);
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}


	public float getPreço() {
		return preço;
	}


	public String getMarca() {
		return marca;
	}
}
