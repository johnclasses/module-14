package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    public List<Tarefa> findByStatus(String status);
}
