package com.mobydigital.ignaciomansilla.TestBackend.repository;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia,Integer> {

    @Query(value ="SELECT * FROM tecnologias  WHERE tecnologias.nombre LIKE '?1%' ",nativeQuery = true)
    Tecnologia findByName(String nombre);

}
