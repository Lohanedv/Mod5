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

import com.mod5Api.Agencia.entities.Destino;
import com.mod5Api.Agencia.services.DestinoService;

@RestController
@RequestMapping("/destino")
public class DestinoResource {
	
	@Autowired
	private DestinoService service;
	
	@GetMapping
	public List<Destino> getAllDestino(){
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Destino getDestinoById(@PathVariable long id) {
		return service.findById(id).get();
	}
	@PostMapping
	public Destino saveDestino(@RequestBody Destino destino){
	return service.saveById(0);
	}
	@DeleteMapping("/{id}")
	public void deleteDestino(@PathVariable Long id){
		service.deleteById(id);
	}
	}
