package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCommande")
     Long idcommande;
    @Temporal(TemporalType.DATE)
     LocalDate dateCommande;
     Integer pourcentageRemise;
     Float totalRemise;
     Float totalCommande;
     Long note;

    @ManyToOne
    Client client;

    @ManyToOne
    Menu menu;
}
