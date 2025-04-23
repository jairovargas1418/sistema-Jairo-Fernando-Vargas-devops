package com.ejemplo.repository;

import com.ejemplo.model.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsignaturaRepository extends MongoRepository<Asignatura, String> {
    Asignatura findByCodigo(String codigo); // Buscar asignatura por código único
}