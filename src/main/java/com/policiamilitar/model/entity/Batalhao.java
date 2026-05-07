package com.policiamilitar.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "batalhões")
public class Batalhao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batalhao_id", nullable = false)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String comandante;
}
