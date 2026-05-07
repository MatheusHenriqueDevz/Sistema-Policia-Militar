package com.policiamilitar.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veiculo_id", nullable = false)
    private Long id;

    @Column(name = "Marca", nullable = false)
    private String marca;

    @Column(name = "Modelo", nullable = false)
    private String modelo;

    @Column(name = "TipoVeiculo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

    @Column(name = "Cor", nullable = false)
    private String cor;

    @Column(name = "Placa", nullable = false, unique = true)
    private String placa;

    @Column(name = "Proprietário", nullable = false)
    private Proprietario proprietario;

    @Column(name = "chassi", nullable = false)
    private String chassi;

    @Column(name = "renavam", nullable = false)
    private String renavam;

    public enum TipoVeiculo {
        CARRO,
        MOTO,
        CAMINHAO,
        TRATOR,
        HELICOPTERO,
        PLANADOR,
        JETSKI;
    }
}