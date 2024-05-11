package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Recurso;
import com.example.demo.services.RecursoService;

@RestController
@RequestMapping(path = "/recurso")
public class RecursoController {
    @Autowired
    RecursoService recursoService;

    @GetMapping
    public List<Recurso> findAll() {
        return recursoService.findAll();
    }

    @GetMapping("/search")
    public List<Recurso> findByDescription(@RequestParam String name) {
        return recursoService.findByName(name);
    }
}
