package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "DetailComposant")
public class DetailComposant  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idDetailComposant;
    private Integer imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;
}
