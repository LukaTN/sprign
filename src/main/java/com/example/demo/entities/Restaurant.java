package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRestaurant")
    private Long idRestaurant;
    private String nom;
    private Integer nbPlacesMax;

    @ManyToOne
    private ChaineRestauration chaineRestauration;
}