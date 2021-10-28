package com.mobydigital.ignaciomansilla.TestBackend.services;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CrearCandidatoDto;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.TecnologiaDto;

import java.util.List;

public interface TecnologiaService {

     void guardar(Tecnologia tecnologia);

    Tecnologia findByName(String nombre);

    void eliminarTecnologia(Integer idTecnologia);

    List<Tecnologia> traerTodas();


    void update(TecnologiaDto tecnologiaDto);
}
