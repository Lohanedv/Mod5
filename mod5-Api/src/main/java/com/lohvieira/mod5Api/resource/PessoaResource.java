package com.lohvieira.mod5Api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lohvieira.mod5Api.entities.Pessoa;
import com.lohvieira.mod5Api.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public List<Pessoa> findAll(){
		return service.findAll();
	}
}
