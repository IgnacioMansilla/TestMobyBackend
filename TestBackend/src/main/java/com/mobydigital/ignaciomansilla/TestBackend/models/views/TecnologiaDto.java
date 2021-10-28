package com.mobydigital.ignaciomansilla.TestBackend.models.views;

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
public class TecnologiaDto {

    private Integer id;
    private String nombre;
    private String version;

}
