package com.policiamilitar.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proprietários")
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sexo", nullable = false)
    private Sexo sexo;

    @Column(name = "RG", nullable = false)
    private String rg;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "Veiculos", nullable = false)
    private Veiculo[] veiculos;

    public enum Sexo {
        MASCULINO,
        FEMININO
    }
}
