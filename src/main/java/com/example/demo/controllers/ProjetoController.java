package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Projeto;
import com.example.demo.services.ProjetoService;

@RestController
@RequestMapping(path = "/projeto")
public class ProjetoController {
    @Autowired
    ProjetoService projetoService;

    @GetMapping
    public List<Projeto> findAll() {
        return projetoService.findAll();
    }

    @GetMapping("/search")
    public List<Projeto> findByDescription(@RequestParam String description) {
        return projetoService.findByDescription(description);
    }
}
