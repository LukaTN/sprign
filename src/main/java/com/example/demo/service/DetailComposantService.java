package com.example.demo.service;
import com.example.demo.entities.DetailComposant;
import com.example.demo.repository.DetailComposantRepo;

import java.util.List;

public class DetailComposantService implements IDetailComposantService{
    DetailComposantRepo detailComposantRepository;

    @Override
    public List<DetailComposant> retrieveAllDetailComposants() {
        return detailComposantRepository.findAll();
    }

    @Override
    public DetailComposant addDetailComposant(DetailComposant e) {
        detailComposantRepository.save(e);
        return e;
    }

    @Override
    public DetailComposant updateDetailComposant(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public DetailComposant retrieveDetailComposant(Long idDetailComposant) {
        return detailComposantRepository.findById(idDetailComposant).get();
    }

    @Override
    public void removeDetailComposant(Long idDetailComposant) {
        detailComposantRepository.deleteById(idDetailComposant);
    }

    @Override
    public List<DetailComposant> addDetailComposants(List<DetailComposant> detailComposants) {
       return detailComposantRepository.saveAll(detailComposants);
    }
}
