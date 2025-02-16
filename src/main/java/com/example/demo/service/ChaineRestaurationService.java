package com.example.demo.service;

import com.example.demo.entities.ChaineRestauration;
import com.example.demo.service.IChaineRestaurationService;
import com.example.demo.repository.ChaineRestaurationRepo;

import java.util.List;

public class ChaineRestaurationService implements IChaineRestaurationService {
    ChaineRestaurationRepo chaineRestaurationRepository;

    @Override
    public List<ChaineRestauration> retrieveAllChainesRestauration() {
        return chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaineRestauration(ChaineRestauration e) {
        chaineRestaurationRepository.save(e);
        return e;
    }

    @Override
    public ChaineRestauration updateChaineRestauration(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration retrieveChaineRestauration(Long idChaineRestauration) {
        return chaineRestaurationRepository.findById(idChaineRestauration).get();
    }

    @Override
    public void removeChaineRestauration(Long idChaineRestauration) {
        chaineRestaurationRepository.deleteById(idChaineRestauration);
    }

    @Override
    public List<ChaineRestauration> addChainesRestauration(List<ChaineRestauration> chainesRestauration) {
        return chaineRestaurationRepository.saveAll(chainesRestauration);
    }
}