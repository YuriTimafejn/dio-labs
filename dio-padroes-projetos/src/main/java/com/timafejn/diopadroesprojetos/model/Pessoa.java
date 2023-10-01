package com.timafejn.diopadroesprojetos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Getter
    private String nome;

    @ManyToOne
    @JoinTable(name = "pessoa_endereco",  joinColumns = @JoinColumn(name = "pessoa_id"), inverseJoinColumns = @JoinColumn(name = "endereco_id"))
    @Getter
    @Setter
    private Endereco endereco;
}
