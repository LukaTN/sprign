package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Client;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {//long heya type mtaa l pk déclarée fel entity

}
