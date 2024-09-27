package com.codecraft.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.codecraft.Repositories.Repositories.UsuarioRepository;
import com.codecraft.Services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
}
