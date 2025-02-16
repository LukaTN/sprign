package com.example.demo.service;

import com.example.demo.entities.DetailComposant;

import java.util.List;

public interface IDetailComposantService {
    List<DetailComposant> retrieveAllDetailComposants();
    DetailComposant addDetailComposant(DetailComposant e);
    DetailComposant updateDetailComposant(DetailComposant e);
    DetailComposant retrieveDetailComposant(Long idDetailComposant);
    void removeDetailComposant(Long idDetailComposant);
    List<DetailComposant> addDetailComposants (List<DetailComposant> DetailComposants);
}
