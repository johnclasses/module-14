package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Tarefa;
import com.example.demo.services.TarefaService;

@RestController
@RequestMapping(path = "/tarefa")
public class TarefaController {
    @Autowired
    TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> findAll() {
        return tarefaService.findAll();
    }

    @GetMapping("/search")
    public List<Tarefa> findByStatus(@RequestParam String status) {
        return tarefaService.findByStatus(status);
    }
}
