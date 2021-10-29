package com.mobydigital.ignaciomansilla.TestBackend.repository;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.CandidatoPorTecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatoPorTecnologiaRepository extends JpaRepository<CandidatoPorTecnologia, Integer> {

    @Query(value ="SELECT * FROM candidato_x_tecnologia cxt WHERE cxt.id_candidato = ?1\"  ",nativeQuery = true)
    List<CandidatoPorTecnologia> findCandidatoPorTecnologiaByIdCandidato(Integer idCandidato);

    @Query(value ="select cxt.id_candidato_x_tecnologia,cxt.id_candidato,cxt.id_tecnologia , cxt.anios_experiencia"
            +"from candidato_x_tecnologia cxt"
            +"INNER JOIN tecnologias t ON cxt.id_tecnologia = t.id_tecnologia"
            +"WHERE t.nombre like ?1",nativeQuery = true)
    List<CandidatoPorTecnologia> findCandidatoPorTecnologiaByNombreTecnologia(String nombre);


}
