package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
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
@Table( name = "ChaineRestauration")
public class ChaineRestauration {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idChaineRestauration")
     Long idChaineRestauration;
     String libelle;
    @Temporal(TemporalType.DATE)
     LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration",cascade = CascadeType.ALL)
     Set<Restaurant> restaurant;
}
