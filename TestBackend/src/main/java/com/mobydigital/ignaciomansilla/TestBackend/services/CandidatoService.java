package com.mobydigital.ignaciomansilla.TestBackend.services;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Candidato;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CandidatoDto;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CrearCandidatoDto;

import java.util.List;

public interface CandidatoService {


    void guardar(CrearCandidatoDto candidatoDto);

    void eliminarCandidato(Integer id);

    List<Candidato> traerTodos();

    void update(CandidatoDto candidatoDto);
}
