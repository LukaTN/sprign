package com.example.demo.controller;


import com.example.demo.service.IMenuService;
import com.example.demo.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuController {
    private IMenuService menuService;
}
