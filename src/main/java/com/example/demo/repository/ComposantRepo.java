package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Composant;


public interface ComposantRepo extends JpaRepository<Composant, Long> {
}
