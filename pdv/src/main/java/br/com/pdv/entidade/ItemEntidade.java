package br.com.pdv.entidade;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item", schema = "pdv")
public class ItemEntidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Long id;

	public Long getId() {
		return id;
	}

	@Column(name = "nome")
	private Int nome;

	public Int getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}

