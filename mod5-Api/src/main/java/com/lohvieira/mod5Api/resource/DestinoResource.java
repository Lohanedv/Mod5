package com.lohvieira.mod5Api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lohvieira.mod5Api.entities.Destino;
import com.lohvieira.mod5Api.services.DestinoService;

@RestController
@RequestMapping(value = "/destino")
public class DestinoResource {
	
	@Autowired
	private DestinoService service;
	
	@GetMapping
	public List<Destino> findAll(){
		return service.findAll();
	}
}
