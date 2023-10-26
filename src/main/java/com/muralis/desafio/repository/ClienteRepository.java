package com.muralis.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import com.muralis.desafio.entity.Cliente;

public interface ClienteRepository 
	extends CrudRepository<Cliente, Integer> {
}
