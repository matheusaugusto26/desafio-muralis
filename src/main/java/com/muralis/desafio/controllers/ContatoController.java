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

import com.muralis.desafio.entity.Contato;
import com.muralis.desafio.repository.ContatoRepository;

@RestController
@RequestMapping("/cadastro/contato")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@PostMapping
	public Contato novoContato (@RequestParam String tipo,
								@RequestParam String texto) {
		Contato contato = new Contato(tipo, texto);
		contatoRepository.save(contato);
		return contato;
	}
	
	@GetMapping
	public Iterable<Contato> listaContato () {
		return contatoRepository.findAll();
	}
	
	@GetMapping(path ="/{id}")
	public Optional<Contato> pesquisaContato(@PathVariable int id) {
		return contatoRepository.findById(id);
	}
	
	@PutMapping(path ="/{id}")
	public Contato alterarContato(@Validated Contato contato) {
		contatoRepository.save(contato);
		return contato;
	}
	
	@DeleteMapping(path ="/{id}")
	public void excluirContato(@PathVariable int id) {
		contatoRepository.deleteById(id);
	}
}
