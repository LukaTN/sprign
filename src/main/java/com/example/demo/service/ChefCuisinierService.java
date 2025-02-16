package com.example.demo.service;

import com.example.demo.entities.ChefCuisinier;
import com.example.demo.repository.ChefCuisinierRepo;

import java.util.List;

public class ChefCuisinierService implements IChefCuisinerService{

    ChefCuisinierRepo chefCuisinierRepository;

    @Override
    public List<ChefCuisinier> retrieveAllChefsCuisinier() {
        return chefCuisinierRepository.findAll();
    }

    @Override
    public ChefCuisinier addChefCuisinier(ChefCuisinier e) {
        chefCuisinierRepository.save(e);
        return e;
    }

    @Override
    public ChefCuisinier updateChefCuisinier(ChefCuisinier e) {
        return chefCuisinierRepository.save(e);
    }

    @Override
    public ChefCuisinier retrieveChefCuisinier(Long idChefCuisinier) {
        return chefCuisinierRepository.findById(idChefCuisinier).get();
    }

    @Override
    public void removeChefCuisinier(Long idChefCuisinier) {
        chefCuisinierRepository.deleteById(idChefCuisinier);
    }

    @Override
    public List<ChefCuisinier> addChefsCuisinier(List<ChefCuisinier> ChefsCuisinier) {
        return chefCuisinierRepository.saveAll(ChefsCuisinier);
    }

}
