package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Projeto;
import com.example.demo.repositories.ProjetoRepository;

@Service
public class ProjetoService {
    @Autowired
    ProjetoRepository projetoRepository;

    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    public List<Projeto> findByDescription(String description) {
        return projetoRepository.findByDescription(description);
    }
}
