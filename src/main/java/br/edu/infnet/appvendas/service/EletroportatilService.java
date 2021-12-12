package br.edu.infnet.appvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvendas.model.domain.Eletroportatil;
import br.edu.infnet.appvendas.model.domain.Usuario;
import br.edu.infnet.appvendas.model.repository.EletroportatilRepository;

@Service
public class EletroportatilService {

	@Autowired
	private EletroportatilRepository eletroportatilRepository;
	
	public void incluir(Eletroportatil eletroportatil) {
		eletroportatilRepository.save(eletroportatil);
	}
	
	public void excluir(Integer id) {
		eletroportatilRepository.deleteById(id);
	}
	
	public Eletroportatil obterPorId(Integer id) {
		return eletroportatilRepository.findById(id).orElse(null);
	}
	
	public List<Eletroportatil> obterLista(Usuario usuario){
		return (List<Eletroportatil>) eletroportatilRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
}
