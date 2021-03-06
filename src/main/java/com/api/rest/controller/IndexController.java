package com.api.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Usuario;
import com.api.rest.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

	@Autowired
	private UsuarioRepository userRepository;

	@GetMapping(value = "/{id}/codigovenda/{venda}", produces = "application/json")
	public ResponseEntity<Usuario> init(@PathVariable Long id, @PathVariable Long venda) {
	
		Optional<Usuario> usuario = userRepository.findById(id);
		
		return new ResponseEntity(usuario.get(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> init(@PathVariable Long id) {
		
		Optional<Usuario> usuario = userRepository.findById(id);
		
		return new ResponseEntity(usuario.get(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<List<Usuario>> usuario() {
	
		List<Usuario> list =(List<Usuario>) userRepository.findAll();
		
		return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
	}
}
