package it.gammainnovation.ms2database;

import it.gammainnovation.ms2database.model.UserEntity;
import it.gammainnovation.ms2database.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final UserRepository userRepository;

    @Autowired
    public Controller(UserRepository ur) { this.userRepository = ur; }

    @PostMapping("/signup")
    public UserEntity signUp(@RequestBody UserEntity newUser) { return this.userRepository.save(newUser); }

}
