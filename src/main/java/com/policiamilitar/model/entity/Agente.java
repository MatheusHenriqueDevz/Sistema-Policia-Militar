package com.policiamilitar.model.entity;

import com.policiamilitar.model.entity.Batalhao;

import jakarta.persistence.*;

@Entity
@Table(name = "agentes")
public class Agente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agente_id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cargo", nullable = false)
    @Enumerated(EnumType.STRING)
    private Cargos cargo;

    @Column(name = "funcional" ,nullable = false)
    private String funcional;

    @ManyToOne
    @JoinColumn(name = "batalhao_id", nullable = false)
    private Batalhao batalhao;

    @Column(nullable = false)
    private String senha;

    public enum Cargos {
        COMANDANTE("COMANDANTE GERAL PM"),
        CORONEL("CORONEL PM"),
        TENENTE_CORONEL("TENENTE CORONEL PM"),
        MAJOR("MAJOR PM"),
        CAPITAO("CAPITAO PM"),
        TENENTE_1("1º TENENTE PM"),
        TENENTE_2("2º TENENTE PM"),
        ASPIRANTE_OFICIAL("ASPIRANTE A OFICIAL PM"),
        ALUNO_3("ALUNO 3º ANO PM"),
        ALUNO_2("ALUNO 2º ANO PM"),
        ALUNO_1("ALUNO 1º ANO PM"),
        ALUNO_CSTAPM("ALUNO CSTAPM"),
        SUBTENENTE("SUBTENENTE PM"),
        SARGENTO_1("1º SARGENTO PM"),
        SARGENTO_2("2º SARGENTO PM"),
        SARGENTO_3("3º SARGENTO PM"),
        ALUNO_SARGENTO("ALUNO SARGENTO PM"),
        CABO("CABO PM"),
        SOLDADO("SOLDADO PM"),
        OPERADOR("OPERADOR PM");


        private String descricao;

        Cargos(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }
}
