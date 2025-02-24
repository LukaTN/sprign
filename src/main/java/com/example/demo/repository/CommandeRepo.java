package com.example.demo.repository;

import com.example.demo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Commande;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface CommandeRepo extends JpaRepository<Commande, Long>{


    List<Commande> findByClient(Client client);

    List<Commande> findByClient_IdClient(Long idClient);

    List<Commande> findByClient_IdClientAndDateCommandeBetween(Long clientIdClient, LocalDate dateCommandeAfter, LocalDate dateCommandeBefore);

    List<Commande> findByDateCommandeBetweenOrderByNote(LocalDate date1, LocalDate date2);
}
