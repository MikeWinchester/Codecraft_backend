package com.codecraft.Repositories.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codecraft.Models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
