package com.mobydigital.ignaciomansilla.TestBackend.controller;

import com.mobydigital.ignaciomansilla.TestBackend.exception.CandidatoNotFoundException;
import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Candidato;
import com.mobydigital.ignaciomansilla.TestBackend.models.entities.CandidatoPorTecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CandidatoDto;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CrearCandidatoDto;
import com.mobydigital.ignaciomansilla.TestBackend.services.CandidatoPorTecnologiaService;
import com.mobydigital.ignaciomansilla.TestBackend.services.CandidatoService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@RequestMapping(value = "/api/candidato")
@RestController

public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @Autowired
    CandidatoPorTecnologiaService candidatoPorTecnologiaService;

    //CREAR CANDIDATO
    @PostMapping(value = "/crear")
    public ResponseEntity<String> crearCandidato(@RequestBody CrearCandidatoDto candidatoDto) {
        candidatoService.guardar(candidatoDto);
        return new ResponseEntity<>("Candidato creado",HttpStatus.CREATED);
    }

    //ACTUALIZAR CANDIDATO
    @PutMapping(value = "/actualizar")
    public ResponseEntity<String> actualizarCandidato(@RequestBody CandidatoDto candidatoDto){
        try {
            candidatoService.update(candidatoDto);
            return new ResponseEntity<>("se actualizo el candidato", HttpStatus.OK);
        }catch (CandidatoNotFoundException candidatoNotFoundException){
            return new ResponseEntity<>(candidatoNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //ELIMINAR CANDIDATO
    @DeleteMapping(value = "/eliminar/{idCandidato}")
    public ResponseEntity<String> eliminarCandidato(@PathVariable Integer idCandidato) {
        candidatoService.eliminarCandidato(idCandidato);
        return new ResponseEntity<>("candidato eliminado" ,HttpStatus.OK);
    }

    //LISTAR CANDIDATOS DTO CON LISTA DE CANDIDATOS POR TECNOLOGIA
    @GetMapping(value = "/traertodos")
    public ResponseEntity<List<CandidatoDto>> traerTodos() {
        return new ResponseEntity<>(candidatoService.traerTodos(), HttpStatus.OK);
    }

    //BUSCAR CANDIDATOS POR X TECNOLOGIA CON SUS AÑOS DE EXPERIENCIA
    @GetMapping(value = "/candidatosxtecnologiabynombre/{nombre}")
        public ResponseEntity<List<CandidatoPorTecnologia>> candidatosXTecnologiaByNombre(@PathVariable String nombre) {
            return new ResponseEntity<>(candidatoPorTecnologiaService.findCandidatoPorTecnologiaByNombreTecnologia(nombre), HttpStatus.OK);
    }
}
