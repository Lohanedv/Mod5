package com.lohvieira.mod5Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohvieira.mod5Api.entities.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino,Long>{
	

}
