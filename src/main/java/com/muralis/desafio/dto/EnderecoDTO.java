package com.muralis.desafio.dto;

public class EnderecoDTO {

	private String cep;
	private String logradouro;
	private String cidade;
	private String numero;
	private String complemento;

	public EnderecoDTO() {
	}

	public EnderecoDTO(String cep, String logradouro, String cidade, String numero, String complemento) {
	        this.cep = cep;
	        this.logradouro = logradouro;
	        this.cidade = cidade;
	        this.numero = numero;
	        this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
