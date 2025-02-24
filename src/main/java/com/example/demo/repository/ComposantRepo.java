package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Composant;
import org.springframework.stereotype.Repository;

@Repository
public interface ComposantRepo extends JpaRepository<Composant, Long> {
}
