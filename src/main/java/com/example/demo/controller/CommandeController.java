package com.example.demo.controller;


import com.example.demo.service.CommandeService;
import com.example.demo.service.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CommandeController {
    private ICommandeService commandeService;


}
