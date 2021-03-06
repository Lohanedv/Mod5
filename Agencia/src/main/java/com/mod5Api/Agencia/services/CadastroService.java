package com.mod5Api.Agencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mod5Api.Agencia.entities.Cadastro;
import com.mod5Api.Agencia.repositories.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repository;
	
	@Transactional(readOnly = true)
	public List<Cadastro> findAll(){
		List<Cadastro> resultado = repository.findAll();
		return resultado;
	}

	public Cadastro findById(long id) {
		return repository.findById(id);
	}
	public Cadastro saveById(long id) {
		return repository.saveById(id);
	}
	public Cadastro deleteById(long id){
		return repository.deleteById(id);
	}
}
