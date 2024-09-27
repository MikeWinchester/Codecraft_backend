package com.codecraft.Repositories.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codecraft.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
