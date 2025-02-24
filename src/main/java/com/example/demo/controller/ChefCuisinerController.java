package com.example.demo.controller;

import com.example.demo.service.ChefCuisinierService;
import com.example.demo.service.IChefCuisinerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ChefCuisinerController {
    private IChefCuisinerService chefCuisinierService;
}
