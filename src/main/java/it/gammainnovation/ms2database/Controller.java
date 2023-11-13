package it.gammainnovation.ms2database;

import it.gammainnovation.librarymodel.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/signup")
    public User signUp(@RequestBody User newUser) {
        return newUser;
    }

}
