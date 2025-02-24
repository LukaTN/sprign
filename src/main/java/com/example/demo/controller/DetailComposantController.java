package com.example.demo.controller;


import com.example.demo.service.DetailComposantService;
import com.example.demo.service.IChefCuisinerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DetailComposantController {
    private IChefCuisinerService detailComposantService;



}
