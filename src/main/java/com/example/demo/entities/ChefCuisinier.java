package com.example.demo.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ChefCuisinier")
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    @ManyToMany
    private List<Menu> menus;
}
