package com.lohvieira.mod5Api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lohvieira.mod5Api.entities.Destino;
import com.lohvieira.mod5Api.repositories.DestinoRepository;

@Service
public class DestinoService {
	
	@Autowired
	private DestinoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Destino> findAll() {
		List<Destino> resultado = repository.findAll();
		return resultado;

	}

}
