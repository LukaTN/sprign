package com.example.demo.repository;

import com.example.demo.entities.ChaineRestauration;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{
    //List<Restaurant> findByRestaurantNbPlacesMaxGreaterThanAndRestaurantChaineDateCreationBefore(Integer capacite, LocalDate date);
    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(Integer capacite,LocalDate dateCreation);
}
