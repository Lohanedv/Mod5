package com.mod5Api.Agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod5Api.Agencia.entities.Destino;

public interface DestinoRepository extends JpaRepository<Destino,Long>{
	
	Destino findById(long id);

	Destino saveById(long id);
	
	Destino deleteById(long id);

}
