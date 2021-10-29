package com.mobydigital.ignaciomansilla.TestBackend.models.views;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.CandidatoPorTecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.enums.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CandidatoDto {

    private Integer id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private String dni;
    private Date fechaNacimiento;

    private List<CandidatoPorTecnologia> candidatoPorTecnologia;

}
