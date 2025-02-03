package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Set;

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
    ChaineRestauration chaineRestauration;

    @OneToMany
    private Set<Menu> menus;

}