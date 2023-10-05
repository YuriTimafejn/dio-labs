package com.timafejn.santanderjava2023.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Client {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    @Setter
    private String cliente;
    @OneToOne(cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Account account;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter
    @Setter
    private List<Card> card;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter
    @Setter
    private List<Feature> feature;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter
    @Setter
    private List<InfoPromo> infoPromo;

}
