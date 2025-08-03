package com.packt.aws.books.pipeline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.aws.books.pipeline.entity.Usuario;
import com.packt.aws.books.pipeline.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	@Autowired
	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario user){
		
		return ResponseEntity.ok(usuarioService.save(user));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable Long id){
		
		var s = usuarioService.getUsuarioByid(id);
		
		return ResponseEntity.ok(s);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getUsuarios(){
		
		return ResponseEntity.ok(usuarioService.getUsuarios());
	}
}
