package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "DetailComposant")
public class DetailComposant  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
     Long idDetailComposant;
     Integer imc;
    @Enumerated(EnumType.STRING)
     TypeComposant typeComposant;
}
