package com.mobydigital.ignaciomansilla.TestBackend.models.views;

import com.mobydigital.ignaciomansilla.TestBackend.models.entities.Tecnologia;
import com.mobydigital.ignaciomansilla.TestBackend.models.enums.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class CrearCandidatoDto {

    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private String dni;
    private Date fechaDeNacimiento;

    List<Tecnologia> tecnologias;
}
