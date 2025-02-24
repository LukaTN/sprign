package com.example.demo.controller;

import com.example.demo.entities.ChaineRestauration;
import com.example.demo.service.ChaineRestaurationService;
import com.example.demo.service.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/jpql")

public class ChaineRestaurationController {

    private IChaineRestaurationService chaineRestaurationService;

    @GetMapping
    public List<ChaineRestauration> getAllchaines() {
        return chaineRestaurationService.retrieveAllChainesRestauration();
    }
}
