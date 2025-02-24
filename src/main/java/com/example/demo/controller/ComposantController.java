package com.example.demo.controller;


import com.example.demo.service.ComposantService;
import com.example.demo.service.IComposantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ComposantController {
    private IComposantService composantService;
}
