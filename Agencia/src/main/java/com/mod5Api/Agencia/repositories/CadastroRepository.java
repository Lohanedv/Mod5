package com.mod5Api.Agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod5Api.Agencia.entities.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro,Long> {
	
	Cadastro findById(long id);

	Cadastro saveById(long id);
	
	Cadastro deleteById(long id);
}
