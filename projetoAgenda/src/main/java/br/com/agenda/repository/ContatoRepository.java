package br.com.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
	List<Contato> findByNomeContato(String nomeContato);
	
		
}
