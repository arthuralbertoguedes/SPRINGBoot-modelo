package br.com.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.model.Contato;
import br.com.agenda.repository.ContatoRepository;

@Service
public class ContatoService {
	
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public Contato save(Contato contato) {
		return contatoRepository.save(contato);
	}
	
	public Contato findByID(Long id) {
		return contatoRepository.findOne(id);
	}
	

}
