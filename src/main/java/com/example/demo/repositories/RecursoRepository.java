package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Recurso;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    public List<Recurso> findByName(String name);
}
