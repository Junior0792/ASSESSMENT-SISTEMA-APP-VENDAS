package br.edu.infnet.appvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvendas.model.domain.Churrasco;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.repository.ChurrascoRepository;

@Service
public class ChurrascoService {

	@Autowired
	private ChurrascoRepository churrascoRepository;
	
	public void incluir(Churrasco churrasco) {
		churrascoRepository.save(churrasco);
	}
	
	public void excluir(Integer id) {
		churrascoRepository.deleteById(id);
	}
	
	public Churrasco obterPorId(Integer id) {
		return churrascoRepository.findById(id).orElse(null);
	}
	
	public List<Churrasco> obterLista(Usuario usuario){
		return (List<Churrasco>) churrascoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
}
