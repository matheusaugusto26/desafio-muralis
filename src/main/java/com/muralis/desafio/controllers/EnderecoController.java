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

import com.muralis.desafio.entity.Endereco;
import com.muralis.desafio.repository.EnderecoRepository;

@RestController
@RequestMapping("/cadastro/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@PostMapping
	public Endereco novoEndereco (@RequestParam String cep,
								  @RequestParam	String logradouro,
								  @RequestParam String cidade,
								  @RequestParam	String numero,
								  @RequestParam	String complemento) {
		Endereco endereco = new Endereco(cep, logradouro, cidade, numero, complemento);
		enderecoRepository.save(endereco);
		return endereco;
	}
	
	@GetMapping
	public Iterable<Endereco> listaEndereco () {
		return enderecoRepository.findAll();
	}
	
	@GetMapping(path ="/{id}")
	public Optional<Endereco> pesquisaEndereco(@PathVariable int id) {
		return enderecoRepository.findById(id);
	}
	
	@PutMapping(path ="/{id}")
	public Endereco alterarEndereco(@Validated Endereco endereco) {
		enderecoRepository.save(endereco);
		return endereco;
	}
	
	@DeleteMapping(path ="/{id}")
	public void excluirEndereco(@PathVariable int id) {
		enderecoRepository.deleteById(id);
	}
}