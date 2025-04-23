package com.ejemplo.repository;

import com.ejemplo.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    List<Usuario> findByTipo(String tipo); // Buscar usuarios por tipo (estudiante/docente)
}