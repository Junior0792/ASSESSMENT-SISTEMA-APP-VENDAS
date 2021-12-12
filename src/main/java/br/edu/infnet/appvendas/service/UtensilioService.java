package br.edu.infnet.appvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.domain.Utensilio;
import br.edu.infnet.appvendas.model.repository.UtensilioRepository;

@Service
public class UtensilioService {

	@Autowired
	private UtensilioRepository utensilioRepository;
	
	public void incluir(Utensilio  utensilio) {
		 utensilioRepository.save( utensilio);
	}
	
	public void excluir(Integer id) {
		 utensilioRepository.deleteById(id);
	}
	
	public  Utensilio obterPorId(Integer id) {
		return  utensilioRepository.findById(id).orElse(null);
	}
	
	public List< Utensilio> obterLista(Usuario usuario){
		return (List< Utensilio>)  utensilioRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
}
