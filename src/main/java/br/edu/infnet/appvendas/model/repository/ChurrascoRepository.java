package br.edu.infnet.appvendas.model.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvendas.model.domain.Churrasco;

@Repository
public interface ChurrascoRepository extends CrudRepository<Churrasco, Integer>{
	
	@Query("from Churrasco b where b.usuario.id =:id")
	public List<Churrasco> findAll(Integer id, Sort by);

}
