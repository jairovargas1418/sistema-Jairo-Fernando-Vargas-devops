package com.ejemplo.service;

import com.ejemplo.model.Matricula;
import com.ejemplo.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public List<Matricula> getAllMatriculas() {
        return matriculaRepository.findAll();
    }

    public Matricula createMatricula(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public List<Matricula> getMatriculasByPeriodo(String periodo) {
        return matriculaRepository.findByPeriodo(periodo);
    }

    public void deleteMatricula(String id) {
        matriculaRepository.deleteById(id);
    }
}