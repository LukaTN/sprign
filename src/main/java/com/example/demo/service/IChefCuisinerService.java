package com.example.demo.service;

import com.example.demo.entities.ChefCuisinier;

import java.util.List;
public interface IChefCuisinerService  {
    List<ChefCuisinier> retrieveAllChefsCuisinier();
    ChefCuisinier addChefCuisinier(ChefCuisinier e);
    ChefCuisinier updateChefCuisinier(ChefCuisinier e);
    ChefCuisinier retrieveChefCuisinier(Long idChefCuisinier);
    void removeChefCuisinier(Long idChefCuisinier);
    List<ChefCuisinier> addChefsCuisinier (List<ChefCuisinier> ChefsCuisinier);
}
