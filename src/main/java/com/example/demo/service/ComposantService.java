package com.example.demo.service;

import com.example.demo.entities.Composant;
import com.example.demo.repository.ComposantRepo;

import java.util.List;

public class ComposantService implements IComposantService {
    ComposantRepo composantRepository;

    @Override
    public List<Composant> retrieveAllComposants() {
        return composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        composantRepository.save(e);
        return e;
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant retrieveComposant(Long idComposant) {
        return composantRepository.findById(idComposant).get();
    }

    @Override
    public void removeComposant(Long idComposant) {
        composantRepository.deleteById(idComposant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        return null;
    }
}
