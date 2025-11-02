package com.guillermo.bancoazteca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guillermo.bancoazteca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByUsername(String username); 

}
