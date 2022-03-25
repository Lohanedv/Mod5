package com.lohvieira.mod5Api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lohvieira.mod5Api.entities.Pessoa;
import com.lohvieira.mod5Api.repositories.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository repository;

	@Transactional(readOnly = true)
	public List<Pessoa> findAll() {
		List<Pessoa> resultado = repository.findAll();
		return resultado;

	}
}
