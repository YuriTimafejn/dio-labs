package com.timafejn.santanderjava2023.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
public class Account {
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
    private String digit;
    @Getter
    @Setter
    private String agency;
    @Getter
    @Setter
    @Column(scale = 13, precision = 2)
    private BigDecimal balance;
    @Getter
    @Setter
    @Column(scale = 13, precision = 2)
    private BigDecimal creditLimit;
}
