package com.mod5Api.Agencia.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nome;
	private Double Telefone;
	private String Email;
	private Double Senha;
	
	public Cadastro(Long id, String nome, Double telefone, String email, Double senha) {
		
		this.id = id;
		Nome = nome;
		Telefone = telefone;
		Email = email;
		Senha = senha;
	}
	public Cadastro() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getTelefone() {
		return Telefone;
	}
	public void setTelefone(Double telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Double getSenha() {
		return Senha;
	}
	public void setSenha(Double senha) {
		Senha = senha;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Email, Nome, Senha, Telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(Nome, other.Nome)
				&& Objects.equals(Senha, other.Senha) && Objects.equals(Telefone, other.Telefone);
	}
	public Cadastro get() {
		// TODO Auto-generated method stub
		return null;
	}

}
