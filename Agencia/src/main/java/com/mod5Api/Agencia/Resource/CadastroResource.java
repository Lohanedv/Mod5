package com.mod5Api.Agencia.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mod5Api.Agencia.entities.Cadastro;
import com.mod5Api.Agencia.services.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {
	
	@Autowired
	private CadastroService service;
	
	@GetMapping
	public List<Cadastro> getAllCadastros(){
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Cadastro getCadastroById(@PathVariable long id) {
		return service.findById(id).get();
	}
	@PostMapping
	public Cadastro saveCadastro(@RequestBody Cadastro cadastro){
	return service.saveById(0);
	}
	@DeleteMapping("/{id}")
	public void deleteCadastro(@PathVariable Long id){
		service.deleteById(id);
	}
	}
