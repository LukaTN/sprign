package com.example.demo.controller;


import com.example.demo.service.ClientService;
import com.example.demo.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ClientController {
    private IClientService clientService;
}
