package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Set;

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

    @OneToMany(mappedBy = "menu")
    private Set<Commande> commandes;

    @OneToMany(mappedBy = "menu")
    private Set<Composant> composants;

    @ManyToMany(mappedBy = "menus")
    private Set<ChefCuisinier> chefsCuisiniers;

}
