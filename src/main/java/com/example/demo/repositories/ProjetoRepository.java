package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByDescription(String description);
}