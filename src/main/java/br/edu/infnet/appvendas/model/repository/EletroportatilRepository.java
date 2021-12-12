package br.edu.infnet.appvendas.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvendas.model.domain.Eletroportatil;

@Repository
public interface EletroportatilRepository extends CrudRepository<Eletroportatil, Integer>{

	@Query("from Eletroportatil b where b.usuario.id =:id")
	public List<Eletroportatil> findAll(Integer id, Sort by);
}
