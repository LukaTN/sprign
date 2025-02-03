package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated
@Table( name = "Client")
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Long idClient; // Clé primaire
    private String identifiant;
    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;
    @Transient // attribut non persisté (pas ajouter a la base de données et on peut le modifier sans changer la table)
    private LocalDate diffBetweenDates;
}
