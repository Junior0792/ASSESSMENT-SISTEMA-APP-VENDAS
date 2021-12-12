package br.edu.infnet.appvendas.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvendas.model.domain.Venda;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Integer>{

	@Query("from Venda p where p.usuario.id = :id")
	public List<Venda> findAll(Integer id, Sort by);
}
