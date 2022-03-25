package com.mod5Api.Agencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mod5Api.Agencia.entities.Destino;
import com.mod5Api.Agencia.repositories.DestinoRepository;

@Service
public class DestinoService {
	
	@Autowired
	private DestinoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Destino> findAll(){
		List<Destino> resultado = repository.findAll();
		return resultado;
	}


	public Destino findById(long id) {
		return repository.findById(id);
	}
	public Destino saveById(long id) {
		return repository.saveById(id);
	}
	public Destino deleteById(long id){
		return repository.deleteById(id);
	}
}
