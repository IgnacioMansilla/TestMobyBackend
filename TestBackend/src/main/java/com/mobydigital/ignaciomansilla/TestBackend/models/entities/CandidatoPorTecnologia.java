package com.mobydigital.ignaciomansilla.TestBackend.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidato_x_tecnologia")
public class CandidatoPorTecnologia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidato_x_tecnologia")
    private Integer idCandidatoPorTecnologia;

    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato")
    @ManyToOne
    private Candidato candidato;

    @JoinColumn(name = "id_tecnologia", referencedColumnName = "id_tecnologia")
    @ManyToOne
    private Tecnologia tecnologia;

    @Column(name = "anios_experiencia")
    private Integer aniosExperiencia;

}
