package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
     Long idMenu;
     String libelleMenu;

    @Enumerated(EnumType.STRING) //make all enum values string
     TypeMenu typeMenu;

     Float prixTotal;

    @OneToMany(mappedBy = "menu")
     Set<Commande> commandes;

    @OneToMany(mappedBy = "menu")
     Set<Composant> composants;

    @ManyToMany(mappedBy = "menus")
     Set<ChefCuisinier> chefsCuisiniers;

}
