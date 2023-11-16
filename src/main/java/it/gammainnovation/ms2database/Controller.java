package it.gammainnovation.ms2database;

import it.gammainnovation.librarymodel.DailyMenu;
import it.gammainnovation.librarymodel.Recipe;
import it.gammainnovation.ms2database.model.RecipeEntity;
import it.gammainnovation.ms2database.services.menu.DailyMenuServiceInterface;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.UserEntity;
import it.gammainnovation.ms2database.repositories.UserRepository;
import it.gammainnovation.ms2database.services.user.UserService;
import it.gammainnovation.ms2database.services.user.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.RecursiveAction;

@RestController
public class Controller {
    DailyMenuServiceInterface dailyMenuService;
    UserServiceInterface userService;

    @Autowired
    public Controller(UserServiceInterface us, DailyMenuServiceInterface dms) {

        this.userService = us;
        this.dailyMenuService = dms;
    }

    @PostMapping("/signup")
    public UserEntity signUp(@RequestBody UserEntity newUser) { return this.userService.signup(newUser); }

    @RequestMapping("/getDailyMenuDB")
    public DailyMenu getDailyMenu(){
        System.out.println("microservizio 2");
        DailyMenuEntity dailyMenuEntity = dailyMenuService.getDailyMenu();
        System.out.println(dailyMenuEntity.getFc1()+" "+ dailyMenuEntity.getFc2());

        DailyMenu result = new DailyMenu();

        Iterable<Recipe> recipes = dailyMenuService.findDailyMenuRecipesByDay(new Date(2023, 11, 13));
        Iterator<Recipe> recipesIterator = recipes.iterator();

        result.setDay(dailyMenuEntity.getDay());
        result.setId(dailyMenuEntity.getId());
        result.setNotes(dailyMenuEntity.getNotes());

        while(recipesIterator.hasNext()) {
            Recipe currentRecipe = recipesIterator.next();
            if (currentRecipe.getId() == dailyMenuEntity.getFc1()) {
                result.setFc1(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getFc2()) {
                result.setFc2(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getFc3()) {
                result.setFc3(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getSc1()) {
                result.setSc1(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getSc2()) {
                result.setSc2(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getSc3()) {
                result.setSc3(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getFru()) {
                result.setFru(currentRecipe);
            }
            if (currentRecipe.getId() == dailyMenuEntity.getDes()) {
                result.setDes(currentRecipe);
            }
        }

        return result;
    }

}
