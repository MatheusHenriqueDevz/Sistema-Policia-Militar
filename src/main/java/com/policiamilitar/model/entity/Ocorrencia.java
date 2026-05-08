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

    @Column(name = "Status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "Observacoes")
    private String observacoes;

    @Column(name = "Local", nullable = false)
    private String local;

    @Column(name = "Data/Hora", nullable = false)
    private String dataHora;

    @Column(name = "Responsável_Abertura", nullable = false)
    private String responsavelAbertura;

    @Column(name = "Responsável_Fechamento", nullable = false)
    private String responsavelFechamento;

    @Column(name = "Relatório_Fechamento")
    private String relatacaoFechamento;

    public enum Status {
        RECUPERADO,
        EM_INVESTIGACAO,
        PROCURADO
    }
}
