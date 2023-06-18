package com.leonel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonel.model.Cursos;
import com.leonel.repository.CursoRepository;

import lombok.AllArgsConstructor;



@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor

public class CursoController {

    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Cursos>list() {
        return cursoRepository.findAll();
    }
}
