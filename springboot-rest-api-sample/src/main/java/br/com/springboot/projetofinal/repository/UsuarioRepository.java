package br.com.springboot.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.projetofinal.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	

}
