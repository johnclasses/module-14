package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Recurso;
import com.example.demo.repositories.RecursoRepository;

@Service
public class RecursoService {
    @Autowired
    RecursoRepository recursoRepository;

    public List<Recurso> findAll() {
        return recursoRepository.findAll();
    }

    public List<Recurso> findByName(String name) {
        return recursoRepository.findByName(name);
    }
}
