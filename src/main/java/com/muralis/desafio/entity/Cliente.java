package com.muralis.desafio.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String datacadastro;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contato_id", referencedColumnName = "id")
	 private Contato contato;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String datacadastro) {
		super();
		this.nome = nome;
		this.datacadastro = datacadastro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}
	
}
