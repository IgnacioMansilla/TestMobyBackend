package com.mobydigital.ignaciomansilla.TestBackend.services.implement;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.views.TecnologiaDto;
import com.mobydigital.ignaciomansilla.TestBackend.repository.TecnologiaRepository;
import com.mobydigital.ignaciomansilla.TestBackend.services.TecnologiaService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class TecnologiaServiceImplement implements TecnologiaService {

    @Autowired
    TecnologiaRepository tecnologiaRepository;

    @Override
    public void guardar(Tecnologia tecnologia) {

        tecnologiaRepository.save(tecnologia);
    }

    @Override
    public Tecnologia findByName(String nombre) {

        return tecnologiaRepository.findByName(nombre);
    }

    @Override
    public void eliminarTecnologia(Integer idTecnologia) {

        tecnologiaRepository.deleteById(idTecnologia);
    }

    @Override
    public List<Tecnologia> traerTodas() {
        return tecnologiaRepository.findAll();
    }

    @Override
    public void update(TecnologiaDto tecnologiaDto) {

        Tecnologia tecnologia = Tecnologia.builder()
                .idTecnologia(tecnologiaDto.getId())
                .nombreTecnologia(tecnologiaDto.getNombre())
                .version(tecnologiaDto.getVersion())
                .build();

        if(tecnologiaRepository.existsById(tecnologiaDto.getId())){
            tecnologiaRepository.save(tecnologia);
        }
    }

}
