package com.muralis.desafio.dto;

public class ClienteDTO {
	 
	private int id;
	private String nome;
	private String dataCadastro;
	private EnderecoDTO endereco;
	private ContatoDTO contato;
	
	public ClienteDTO() {
	}
		
	public ClienteDTO(int id, String nome, String dataCadastro, EnderecoDTO endereco, ContatoDTO contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.endereco = endereco;
		this.contato = contato;
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

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public ContatoDTO getContato() {
		return contato;
	}

	public void setContato(ContatoDTO contato) {
		this.contato = contato;
	}
	
}
