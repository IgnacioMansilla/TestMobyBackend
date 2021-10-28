package com.mobydigital.ignaciomansilla.TestBackend.models.views;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Candidato;
import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CandidatoPorTecnologiaDto {

    private Integer idCandidatoPorTecnologia;
    private Candidato idCandidato;
    private Tecnologia idTecnologia;
    private Integer aniosExperiencia;
}

