package com.example.demo.controller;

import com.example.demo.service.IRestaurantService;
import com.example.demo.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private IRestaurantService restaurantService;

}
