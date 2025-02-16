package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Commande;

public interface CommandeRepo extends JpaRepository<Commande, Long>{
}
