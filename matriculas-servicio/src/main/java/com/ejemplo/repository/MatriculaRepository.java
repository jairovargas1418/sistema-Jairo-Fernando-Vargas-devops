package com.ejemplo.repository;

import com.ejemplo.model.Matricula;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface MatriculaRepository extends MongoRepository<Matricula, String> {
    List<Matricula> findByPeriodo(String periodo); // Buscar matrículas por periodo
}