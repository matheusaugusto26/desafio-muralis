package com.muralis.desafio.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.muralis.desafio.entity.Cliente;
import com.muralis.desafio.repository.ClienteRepository;

@RestController
@RequestMapping("/cadastro/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente novoCliente (@RequestParam String nome, 
								@RequestParam String datacadastro) {
		Cliente cliente = new Cliente(nome, datacadastro);
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@GetMapping
	public Iterable<Cliente> listaCliente () {
		return clienteRepository.findAll();
	}
	
	@GetMapping(path ="/{id}")
	public Optional<Cliente> pesquisaCliente(@PathVariable int id) {
		return clienteRepository.findById(id);
	}
	
	@PutMapping(path ="/{id}")
	public Cliente alterarCliente(@Validated Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@DeleteMapping(path ="/{id}")
	public void excluirCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}
}