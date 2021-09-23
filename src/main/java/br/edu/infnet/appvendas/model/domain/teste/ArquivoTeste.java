package br.edu.infnet.appvendas.model.domain.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appvendas.model.domain.Cliente;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Eletroportatil;
import br.edu.infnet.appvendas.model.domain.Produto;
import br.edu.infnet.appvendas.model.domain.Venda;
import br.edu.infnet.appvendas.model.exceptions.PesoNegativoException;
import br.edu.infnet.appvendas.model.exceptions.PotenciaNegativoException;
import br.edu.infnet.appvendas.model.exceptions.QuantidadeNegativoException;

public class ArquivoTeste {
  
public static void main(String[] args) {
		
		String dir = "C:/Users/junio/appvendas/";
		String arq = "vends.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				List<Produto> produtos = new ArrayList<Produto>();
				Venda venda = new Venda();


				while(linha != null) {
					
					campos = linha.split(";");
					
					if(campos.length == 5) {
						Cliente cliente = new Cliente(
								campos[2], 
								campos[3], 
								campos[4]
							);

						venda.setInformacao(campos[0]);
						venda.setDesconto(Boolean.valueOf(campos[1]));
						venda.setCliente(cliente);
					} else {
						
						switch (campos[0]) {
						case "Utensilio":
							Utensilio utensilio = new Utensilio(
									campos[1],
									Float.valueOf(campos[2]),
									campos[3]);
							try {
								utensilio.setQuantidade(Float.valueOf(campos[4]));
								utensilio.setCor(campos[5]);
								utensilio.setInox(Boolean.valueOf(campos[6]));
								
								produtos.add(utensilio);

							} catch (QuantidadeNegativoException e) {
								System.out.println(e.getMessage());		
							}
							

							break;

						case "Eletroportatil":
							Eletroportatil eletroportatil = new Eletroportatil(
									campos[1],
									Float.valueOf(campos[2]),
									campos[3]);
							try {
								eletroportatil.setPotencia(Float.valueOf(campos[4]));
								eletroportatil.setCor(campos[5]);
								eletroportatil.setGarantía(Boolean.valueOf(campos[6]));
								
								produtos.add(eletroportatil);

							} catch (PotenciaNegativoException e) {
								System.out.println(e.getMessage());
							}
							
							break;

						case "Churrasco":
							Churrasco churrasco = new Churrasco(
									campos[1],
									Float.valueOf(campos[2]),
									campos[3]);
							try {
								churrasco.setPeso(Float.valueOf(campos[6]));
								churrasco.setPicanha(Boolean.valueOf(campos[5]));
								churrasco.setTempero(campos[4]);
								
								produtos.add(churrasco);
								
							} catch (PesoNegativoException e) {
								System.out.println(e.getMessage());
							}
							
							churrasco.setTempero(null);
							break;
							
						default:
							System.out.println("Pedido sem tipo!!!");
							break;
						}
					}					

					linha = leitura.readLine();
				}
				
				venda.setProdutos(produtos);
				
				System.out.println(venda);
				
				for(Produto pr : venda.getProdutos()) {
					escrita.write(
							venda.getInformacao()+";"+
							venda.getCliente().getNome()+";"+
							pr.getNome()+";"+
							pr.somarPreços()+"\r\n");

				}
				

				leitura.close();
				file.close();
				
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
	}

}
