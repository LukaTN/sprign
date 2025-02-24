package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.DetailComposant;
import org.springframework.stereotype.Repository;


@Repository
public interface DetailComposantRepo extends JpaRepository<DetailComposant, Long>{
}
