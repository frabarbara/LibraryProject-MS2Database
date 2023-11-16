package it.gammainnovation.ms2database;

import it.gammainnovation.librarymodel.DailyMenu;
import it.gammainnovation.librarymodel.Recipe;
import it.gammainnovation.librarymodel.RestaurantTurn;
import it.gammainnovation.ms2database.model.RecipeEntity;
import it.gammainnovation.ms2database.model.RestaurantTurnEntity;
import it.gammainnovation.ms2database.services.menu.DailyMenuServiceInterface;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.UserEntity;
import it.gammainnovation.ms2database.repositories.UserRepository;
import it.gammainnovation.ms2database.services.restaurant.RestTurnServiceInterface;
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
import java.util.List;
import java.util.concurrent.RecursiveAction;

@RestController
public class Controller {
    DailyMenuServiceInterface dailyMenuService;
    UserServiceInterface userService;
    RestTurnServiceInterface restTurnService;

    @Autowired
    public Controller(UserServiceInterface us, DailyMenuServiceInterface dms, RestTurnServiceInterface rts) {
        this.userService = us;
        this.dailyMenuService = dms;
        this.restTurnService = rts;
    }

    @PostMapping("/signup")
    public UserEntity signUp(@RequestBody UserEntity newUser) { return this.userService.signup(newUser); }

    @RequestMapping("/getDailyMenuDB")
    public DailyMenuEntity getDailyMenu(){
        System.out.println("microservizio 2");
        return dailyMenuService.getDailyMenu();
    }

    @RequestMapping("/getRestaurantTurn")
    public List<RestaurantTurnEntity> getRestaurantTurn(){
        List<RestaurantTurnEntity> restaurantTurn = restTurnService.getRestaurantTurns();
        return restaurantTurn;
    }

}
