package br.edu.infnet.appvendas.model.domain;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Venda {

	private String informacao;
	private Cliente cliente;
	private LocalDateTime data;
	private boolean desconto;
	private List<Produto> produtos;
	

	public Venda() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter modelo = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		StringBuilder sb = new StringBuilder();
		sb.append(informacao);
		sb.append(";");
		sb.append(cliente.toString());
		sb.append(";");
		sb.append(data.format(modelo));
		sb.append(";");
		sb.append(desconto);
		sb.append(";");
		sb.append(produtos.size());
		
		return sb.toString();
	}
	
	
	public boolean isDesconto() {
		return desconto;
	}

	public void setDesconto(boolean desconto) {
		this.desconto = desconto;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	} 
	
	
}


