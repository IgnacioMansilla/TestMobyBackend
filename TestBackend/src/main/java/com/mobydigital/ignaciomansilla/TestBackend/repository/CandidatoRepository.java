package com.mobydigital.ignaciomansilla.TestBackend.repository;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository <Candidato,Integer> {

}
