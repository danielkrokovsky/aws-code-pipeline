package com.packt.aws.books.pipeline.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packt.aws.books.pipeline.entity.Usuario;
import com.packt.aws.books.pipeline.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Usuario save(Usuario user) {
		
		return repository.save(user);
	}
	
	public Usuario getUsuarioByid(Long id) {
		
		return repository.findUsuarioByid(id);
	}
	
	public List<Usuario> getUsuarios() {
		
		return repository.findAll();
	}
}
