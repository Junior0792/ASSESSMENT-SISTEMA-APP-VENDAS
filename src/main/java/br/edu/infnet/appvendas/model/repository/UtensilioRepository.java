package br.edu.infnet.appvendas.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvendas.model.domain.Utensilio;

@Repository
public interface UtensilioRepository extends CrudRepository<Utensilio, Integer>{

	@Query("from Utensilio b where b.usuario.id =:id")
	public List<Utensilio> findAll(Integer id, Sort by);

}
