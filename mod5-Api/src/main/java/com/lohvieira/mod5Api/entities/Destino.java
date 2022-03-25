package com.lohvieira.mod5Api.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String DestinoViagem;
	private Date DataIda;
	private Date DataVolta;
	
	public Destino(long id, String destinoViagem, Date dataIda, Date dataVolta) {
		
		this.id = id;
		DestinoViagem = destinoViagem;
		DataIda = dataIda;
		DataVolta = dataVolta;
	}
	public Destino() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDestinoViagem() {
		return DestinoViagem;
	}
	public void setDestinoViagem(String destinoViagem) {
		DestinoViagem = destinoViagem;
	}
	public Date getDataIda() {
		return DataIda;
	}
	public void setDataIda(Date dataIda) {
		DataIda = dataIda;
	}
	public Date getDataVolta() {
		return DataVolta;
	}
	public void setDataVolta(Date dataVolta) {
		DataVolta = dataVolta;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DataIda, DataVolta, DestinoViagem);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return Objects.equals(DataIda, other.DataIda) && Objects.equals(DataVolta, other.DataVolta)
				&& Objects.equals(DestinoViagem, other.DestinoViagem);
	}
	}
