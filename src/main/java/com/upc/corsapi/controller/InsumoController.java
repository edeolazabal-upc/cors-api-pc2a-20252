package com.upc.corsapi.controller;

import com.upc.corsapi.model.Insumo;
import com.upc.corsapi.repository.InsumoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insumos")
@CrossOrigin(origins = {"http://localhost:9876", "http://localhost:4200"}) // Habilita CORS para el puerto Angular
public class InsumoController {
    private final InsumoRepository insumoRepository;

    public InsumoController(InsumoRepository insumoRepository) {
        this.insumoRepository = insumoRepository;
    }
    @GetMapping
    public List<Insumo> getInsumos() {
        return insumoRepository.findAll();
    }

    @PostMapping("")
    public Insumo addInsumo(@RequestBody Insumo insumo) {
        return insumoRepository.save(insumo);
    }

    @DeleteMapping("/{id}")
    public void deleteInsumo(@PathVariable Long id) {
        insumoRepository.deleteById(id);
    }
}
