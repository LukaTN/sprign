package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Composant")
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idComposant;
    private String nomComposant;
    private Float prix;

    @ManyToOne
    Menu menu;

    @OneToOne
    private DetailComposant detailComposant;
}
