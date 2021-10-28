package com.mobydigital.ignaciomansilla.TestBackend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tecnologias")
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tecnologia")
    private Integer idTecnologia;

    @Column(name = "nombre")
    private String nombreTecnologia;

    @Column(name = "version")
    private String version;


}
