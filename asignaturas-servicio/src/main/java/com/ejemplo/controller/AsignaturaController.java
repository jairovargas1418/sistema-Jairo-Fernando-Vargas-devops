package com.ejemplo.controller;

import com.ejemplo.model.Asignatura;
import com.ejemplo.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaService.getAllAsignaturas();
    }

    @PostMapping
    public Asignatura createAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaService.createAsignatura(asignatura);
    }

    @GetMapping("/codigo/{codigo}")
    public Asignatura getAsignaturaByCodigo(@PathVariable String codigo) {
        return asignaturaService.getAsignaturaByCodigo(codigo);
    }

    @DeleteMapping("/{id}")
    public void deleteAsignatura(@PathVariable String id) {
        asignaturaService.deleteAsignatura(id);
    }
}