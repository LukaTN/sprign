package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.ChaineRestauration;
import org.springframework.stereotype.Repository;


@Repository
public interface ChaineRestaurationRepo extends JpaRepository<ChaineRestauration, Long>{


}
