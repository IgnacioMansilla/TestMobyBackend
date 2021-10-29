package com.mobydigital.ignaciomansilla.TestBackend.services;


import com.mobydigital.ignaciomansilla.TestBackend.models.entities.CandidatoPorTecnologia;


import java.util.List;

public interface CandidatoPorTecnologiaService {

    List<CandidatoPorTecnologia> findCandidatoPorTecnologiaByIdCandidato(Integer idCandidato);

    List<CandidatoPorTecnologia> findCandidatoPorTecnologiaByNombreTecnologia(String nombre);
}
