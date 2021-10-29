package com.mobydigital.ignaciomansilla.TestBackend.services.implement;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.CandidatoPorTecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.repository.CandidatoPorTecnologiaRepository;
import com.mobydigital.ignaciomansilla.TestBackend.services.CandidatoPorTecnologiaService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Log
@Service
public class CandidatoPorTecnologiaServiceImplement implements CandidatoPorTecnologiaService {

    @Autowired
    CandidatoPorTecnologiaRepository candidatoPorTecnologiaRepository;

    @Override
    public List<CandidatoPorTecnologia> findCandidatoPorTecnologiaByIdCandidato(Integer idCandidato) {

        return candidatoPorTecnologiaRepository.findCandidatoPorTecnologiaByIdCandidato(idCandidato);
    }

    @Override
    public List<CandidatoPorTecnologia> findCandidatoPorTecnologiaByNombreTecnologia(String nombre) {
        return candidatoPorTecnologiaRepository.findCandidatoPorTecnologiaByNombreTecnologia(nombre);
    }

}
