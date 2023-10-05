package com.timafejn.santanderjava2023.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @Column(unique = true)
    private String number;
    @Getter
    @Setter
    private String type;
}
