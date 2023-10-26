package com.muralis.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import com.muralis.desafio.entity.Contato;

public interface ContatoRepository 
	extends CrudRepository<Contato, Integer> {

}
