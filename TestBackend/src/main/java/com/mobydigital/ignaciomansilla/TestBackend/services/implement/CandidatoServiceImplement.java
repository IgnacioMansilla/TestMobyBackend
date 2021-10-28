package com.mobydigital.ignaciomansilla.TestBackend.services.implement;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Candidato;
import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CandidatoDto;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.CrearCandidatoDto;
import com.mobydigital.ignaciomansilla.TestBackend.repository.CandidatoRepository;
import com.mobydigital.ignaciomansilla.TestBackend.services.CandidatoService;
import com.mobydigital.ignaciomansilla.TestBackend.services.TecnologiaService;
import lombok.Builder;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log
@Service
public class CandidatoServiceImplement implements CandidatoService {

    @Autowired
    CandidatoRepository candidatoRepository;

    /*@Override
    public Candidato crearCandidato(Candidato candidato){
        log.info("se agrego el candidato : " + candidato.getNombre());
        return candidatoRepository.save(candidato);
    }*/

    @Override
    public void guardar(CrearCandidatoDto crearCandidatoDto) {


        List<Tecnologia> tecnologias = new ArrayList<>();
        tecnologias.add(Tecnologia.builder()
                .nombreTecnologia("JAVA")
                .version("1.0")
                .build());
        Candidato candidato = Candidato.builder()
                .nombre(crearCandidatoDto.getNombre())
                .apellido(crearCandidatoDto.getApellido())
                .tipo(crearCandidatoDto.getTipoDocumento())
                .dni(crearCandidatoDto.getDni())
                .fechaNacimiento(crearCandidatoDto.getFechaDeNacimiento())
                .tecnologias(tecnologias)
                .build();

        candidatoRepository.save(candidato);
        log.info("se agrego el candidato : " + candidato.getNombre());
    }

    @Override
    public void eliminarCandidato(Integer idCandidato) {
        candidatoRepository.deleteById(idCandidato);
    }

    @Override
    public List<Candidato> traerTodos() {
        return candidatoRepository.findAll();
    }

    @Override
    public void update(CandidatoDto candidatoDto) {

        Candidato candidato = Candidato.builder()
                .idCandidato(candidatoDto.getId())
                .nombre(candidatoDto.getNombre())
                .apellido(candidatoDto.getApellido())
                .tipo(candidatoDto.getTipoDocumento())
                .dni(candidatoDto.getDni())
                .fechaNacimiento(candidatoDto.getFechaNacimiento())
                .build();

        if (candidatoRepository.existsById(candidatoDto.getId())) {
            candidatoRepository.save(candidato);
        }
    }

}
