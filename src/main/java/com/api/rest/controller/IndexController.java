package com.api.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> init() {
		Usuario user = new Usuario();
		user.setId(1L);
		user.setLogin("fab");
		user.setSenha("123");
		user.setNome("Fabiano");
		return ResponseEntity.ok(user);
	}
}
