package com.example.demo.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity

@Table( name = "ChaineRestauration")
public class ChaineRestauration {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idChaineRestauration")
    private Long idChaineRestauration;
    private String libelle;
    @Temporal(TemporalType.DATE)
    private LocalDate localDate;

    @OneToMany
    private List<Restaurant> restaurant;
}
