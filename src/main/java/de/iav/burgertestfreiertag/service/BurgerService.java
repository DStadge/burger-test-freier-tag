package de.iav.burgertestfreiertag.service;

import de.iav.burgertestfreiertag.model.Menu;
import de.iav.burgertestfreiertag.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {

    private final MenuRepository menuCard;

    public BurgerService(MenuRepository menuCard) {
        this.menuCard = menuCard;
    }

//alle
    public List<Menu> getMenuBoard() {
        return menuCard.getMenuBoard();
    }
//byID
    public Menu getMenuById(int id) {
        return menuCard.getMenuById(id);
    }
//Add menu
    public void addMenu(Menu menuToAdd) {
        menuCard.addMenu(menuToAdd);
    }
//delete Menu
    public void deleteMenuById(int id) {
        menuCard.deleteMenuById(id);
    }

//Ändert Menu
    public Menu changeMenu(int idToChange, Menu newMenu) {
        return menuCard.changeMenu(idToChange, newMenu);
    }


}
