package com.example.demo.service;

import com.example.demo.entities.ChaineRestauration;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChainesRestauration();
    ChaineRestauration addChaineRestauration(ChaineRestauration e);
    ChaineRestauration updateChaineRestauration(ChaineRestauration e);
    ChaineRestauration retrieveChaineRestauration(Long idChaineRestauration);
    void removeChaineRestauration(Long idChaineRestauration);
    List<ChaineRestauration> addChainesRestauration(List<ChaineRestauration> chainesRestauration);
}