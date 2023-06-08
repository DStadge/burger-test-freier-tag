package de.iav.burgertestfreiertag.repository;

import de.iav.burgertestfreiertag.model.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MenuRepository {

    private List<Menu> menuBoard = new ArrayList<>();

    public MenuRepository(List<Menu> menuBoard) {
        this.menuBoard = menuBoard;
    }


    public List<Menu> getMenuBoard() {
        return menuBoard;
    }

    public Menu getMenuById(int id) {
        for (Menu singleMenu : menuBoard) {
            if (singleMenu.id() == id) {
                return singleMenu;
            }
        }
        throw new NoSuchElementException("Menu nicht gefunden!!!");
    }
/*
    public Menu addMenu(Menu menuToAdd){
        menuBoard.add(menuToAdd);
    return menuToAdd;
    }
    Methode mit Rückgabewert, aber nicht nötig!
*/

    //Methode ohne Rückgabewert:
    public void addMenu(Menu menuToAdd) {
        menuBoard.add(menuToAdd);
    }

    //Alternative zum löschen eines Menus ohne Rückgabewert
    public void deleteMenuById(int id) {
        for (Menu singleMenu : menuBoard) {
            if (singleMenu.id() == id) {
                menuBoard.remove(singleMenu);
                return;
            }
        }
        throw new NoSuchElementException("Menu nicht gefunden!!!");
    }

//Alternative zum löschen eines Menus ohne Rückgabewert

    /*

    public void deleteMenuById (int idToDelete){
         Menu menuToDelete = this.getMenuById(idToDelete);
         menuBoard.remove(menuToDelete);
    }
*/
//mit Rückagbewert ....wurde gelöscht und ersetzt durch ....
    public Menu changeMenu (int idToChange, Menu newMenu){
    Menu menuToChange = this.getMenuById(idToChange);
    menuBoard.remove(menuToChange);
    Menu menuToAdd = new Menu(idToChange, newMenu.name(), newMenu.price(), newMenu.mainDish(), newMenu.sideDish(), newMenu.beverage());
    menuBoard.add(menuToAdd);
    return (menuToAdd);
    }





}









