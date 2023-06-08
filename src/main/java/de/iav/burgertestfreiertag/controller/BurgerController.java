package de.iav.burgertestfreiertag.controller;

import de.iav.burgertestfreiertag.model.Menu;
import de.iav.burgertestfreiertag.service.BurgerService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BurgerController {


    private BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping("/menus")
    public List<Menu> getManuBoard() {
        return burgerService.getMenuBoard();
    }

    @GetMapping("/menus/{id}")
    public Menu getMenuById(@PathVariable int id) {
        return burgerService.getMenuById(id);
    }

    @PutMapping("/menus/{id}")
    public Menu changeMenu(@PathVariable int id, @RequestBody Menu newMenu){
        return burgerService.changeMenu(id, newMenu);

    }
    @PostMapping("/menus")
    public void addMenu(@RequestBody Menu menuToAdd){
        burgerService.addMenu(menuToAdd);
    }

    @DeleteMapping("/menus/{id}")
    public void deleteMenuById (@PathVariable int id){
        burgerService.deleteMenuById(id);
    }




}
