package com.ejemplo.controller;

import com.ejemplo.model.Matricula;
import com.ejemplo.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> getAllMatriculas() {
        return matriculaService.getAllMatriculas();
    }

    @PostMapping
    public Matricula createMatricula(@RequestBody Matricula matricula) {
        return matriculaService.createMatricula(matricula);
    }

    @GetMapping("/periodo/{periodo}")
    public List<Matricula> getMatriculasByPeriodo(@PathVariable String periodo) {
        return matriculaService.getMatriculasByPeriodo(periodo);
    }

    @DeleteMapping("/{id}")
    public void deleteMatricula(@PathVariable String id) {
        matriculaService.deleteMatricula(id);
    }
}