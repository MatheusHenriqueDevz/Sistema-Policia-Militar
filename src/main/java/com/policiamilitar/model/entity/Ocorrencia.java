package com.policiamilitar.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ocorrências")
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ocorrencia_id", nullable = false)
    private Long id;

    @Column(name = "Boletim_Ocorrencia")
    private String boletimOcorrencia;

    @Column(name = "Veiculo", nullable = false)
    private Veiculo veiculo;
}
