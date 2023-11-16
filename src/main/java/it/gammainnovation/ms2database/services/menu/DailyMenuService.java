package it.gammainnovation.ms2database.services.menu;

import it.gammainnovation.librarymodel.Recipe;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.RecipeEntity;
import it.gammainnovation.ms2database.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DailyMenuService implements DailyMenuServiceInterface {

    MenuRepository menuRepository;

    @Autowired
    public DailyMenuService(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    @Override
    public DailyMenuEntity getDailyMenu() {
        System.out.println("[DailyMenuService:getDailyMenu] entered");
       List<DailyMenuEntity> result = null;
        try {
            result = menuRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.get(0);
    }

    @Override
    public Iterable<Recipe> findDailyMenuRecipesByDay(Date day) {
        return menuRepository.findDailyMenuRecipesByDay(day);
    }
}
