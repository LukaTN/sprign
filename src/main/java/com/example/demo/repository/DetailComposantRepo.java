package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.DetailComposant;

public interface DetailComposantRepo extends JpaRepository<DetailComposant, Long>{
}
