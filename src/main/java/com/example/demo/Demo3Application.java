package com.example.demo;

import com.example.demo.entities.Client;
import com.example.demo.service.ClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);


        /*ClientService clientService = new ClientService();
        Long idClient = 1L;
        Client client = Client.builder().idClient(idClient).identifiant("1").datePremiereVisite(LocalDate.now()).build();
        clientService.addClient(client);*/


    }
}
