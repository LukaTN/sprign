package com.example.demo.repository;

import com.example.demo.entities.ChaineRestauration;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{

    @Query("SELECT r FROM Restaurant r WHERE r.nbPlacesMax > :capacite AND r.chaineRestauration.dateCreation < :date")
    List<Restaurant> findByCapaciteGreaterThanAndChaineRestauration_DateCreationBefore(@Param("capacite") int capacite, @Param("date") LocalDate date);
}
