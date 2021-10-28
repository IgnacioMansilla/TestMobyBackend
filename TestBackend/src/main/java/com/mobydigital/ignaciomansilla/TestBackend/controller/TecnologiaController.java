package com.mobydigital.ignaciomansilla.TestBackend.controller;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.TecnologiaDto;
import com.mobydigital.ignaciomansilla.TestBackend.services.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/tecnologia")
@RestController

public class TecnologiaController {

    @Autowired
    TecnologiaService tecnologiaService;

    //CREAR TECNOLOGIA
    @PostMapping(value = "/crear")
    public ResponseEntity<String> crearTecnologia(@RequestBody Tecnologia tecnologia) {
        tecnologiaService.guardar(tecnologia);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //ACTUALIZAR TECNOLOGIA
    @PutMapping(value = "/actualizar")
    public ResponseEntity<String> actualizarTecnologia(@RequestBody TecnologiaDto tecnologiaDto){
        tecnologiaService.update(tecnologiaDto);
        return new ResponseEntity<>("se actualizo la tecnologia",HttpStatus.OK);
    }

    //ELIMINAR TECNOLOGIA
    @DeleteMapping(value = "/eliminar/{idTecnologia}")
    public ResponseEntity<Integer> eliminarCandidato(@PathVariable Integer idTecnologia) {
        tecnologiaService.eliminarTecnologia(idTecnologia);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //LISTAR TECNOLOGIAS
    @GetMapping(value = "/traertodas")
    public ResponseEntity<List<Tecnologia>> traerTodas() {
        return new ResponseEntity<>(tecnologiaService.traerTodas(), HttpStatus.OK);
    }
}
