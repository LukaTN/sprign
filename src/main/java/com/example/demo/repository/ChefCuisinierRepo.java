package com.example.demo.repository;

import com.example.demo.entities.ChefCuisinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefCuisinierRepo  extends JpaRepository<ChefCuisinier, Long>{
}
