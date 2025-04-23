package com.ejemplo.service;

import com.ejemplo.model.Asignatura;
import com.ejemplo.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<Asignatura> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }

    public Asignatura createAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    public Asignatura getAsignaturaByCodigo(String codigo) {
        return asignaturaRepository.findByCodigo(codigo);
    }

    public void deleteAsignatura(String id) {
        asignaturaRepository.deleteById(id);
    }
}