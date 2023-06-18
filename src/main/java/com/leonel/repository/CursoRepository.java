package com.leonel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonel.model.Cursos;

@Repository
public interface CursoRepository extends JpaRepository<Cursos, Long>{
    
}
