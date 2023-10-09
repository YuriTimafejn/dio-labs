package com.timafejn.santanderjava2023.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;
    @Setter
    @Column(unique = true)
    private String number;
    @Setter
    private String digit;
    @Setter
    private String agency;
    @Setter
    @Column(scale = 2, precision = 13)
    private BigDecimal balance;
    @Setter
    @Column(scale = 2, precision = 13)
    private BigDecimal creditLimit;
}
