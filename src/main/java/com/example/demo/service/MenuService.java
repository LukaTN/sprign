package com.example.demo.service;

import com.example.demo.entities.Menu;
import com.example.demo.repository.MenuRepo;

import java.util.List;

public class MenuService implements IMenuService {
    private MenuRepo menuRepo;

    @Override
    public List<Menu> retrieveAllMenus() {
        return menuRepo.findAll();
    }

    @Override
    public Menu addMenu(Menu e) {
        menuRepo.save(e);
        return e;
    }

    @Override
    public Menu updateMenu(Menu e) {
        return menuRepo.save(e);
    }

    @Override
    public Menu retrieveMenu(Long idMenu) {
        return menuRepo.findById(idMenu).get();
    }

    @Override
    public void removeMenu(Long idMenu) {
        menuRepo.deleteById(idMenu);
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return menuRepo.saveAll(menus);
    }
}