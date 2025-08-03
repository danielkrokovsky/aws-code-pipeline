package com.packt.aws.books.pipeline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packt.aws.books.pipeline.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	Usuario findUsuarioByid(Long id);

}
