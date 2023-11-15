package it.gammainnovation.ms2database;

import it.gammainnovation.ms2database.Service.DailyMenuService;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.UserEntity;
import it.gammainnovation.ms2database.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    DailyMenuService dailyMenuService;
    UserRepository userRepository;

    @Autowired
    public Controller(UserRepository userRepository,DailyMenuService dailyMenuService) {

        this.userRepository = userRepository;
        this.dailyMenuService = dailyMenuService;
    }

    @PostMapping("/signup")
    public UserEntity signUp(@RequestBody UserEntity newUser) { return this.userRepository.save(newUser); }

    @RequestMapping("/getDailyMenuDB")
    public DailyMenuEntity getDailyMenu(){
        System.out.println("microservizio 2");
        DailyMenuEntity dailyMenuEntity = dailyMenuService.getDailyMenu();
        System.out.println(dailyMenuEntity.getFc1()+" "+ dailyMenuEntity.getFc2());
        return dailyMenuEntity;

    }

}
