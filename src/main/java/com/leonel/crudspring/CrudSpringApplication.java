package com.leonel.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.leonel.model.Cursos;
import com.leonel.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
@Bean
CommandLineRunner initDatabase(CursoRepository cursoRepository){
	return args ->{
		cursoRepository.deleteAll();
		Cursos c = new Cursos();
		c.setName("Angular com Spring");
		c.setCategory("Fronbt-End");
		cursoRepository.save(c);
	};
}

}
