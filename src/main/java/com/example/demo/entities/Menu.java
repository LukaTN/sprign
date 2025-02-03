package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
    private Long idMenu;
    private String libelleMenu;

    @Enumerated(EnumType.STRING) //make all enum values string
    private TypeMenu typeMenu;

    private Float prixTotal;

    @ManyToOne
    private Restaurant restaurant;
}
