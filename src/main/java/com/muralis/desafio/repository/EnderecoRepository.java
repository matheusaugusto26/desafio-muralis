package com.muralis.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import com.muralis.desafio.entity.Endereco;

public interface EnderecoRepository 
	extends CrudRepository<Endereco, Integer> {

}
