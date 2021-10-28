package com.mobydigital.ignaciomansilla.TestBackend.repository;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.CandidatoPorTecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoPorTecnologiaRepository extends JpaRepository<CandidatoPorTecnologia, Integer> {
}
