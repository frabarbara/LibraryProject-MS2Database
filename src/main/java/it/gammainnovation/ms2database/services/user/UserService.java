package it.gammainnovation.ms2database.services.user;

import it.gammainnovation.ms2database.model.UserEntity;
import it.gammainnovation.ms2database.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository ur) {
        this.userRepository = ur;
    }

    @Override
    public UserEntity signup(UserEntity newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public UserEntity login(UserEntity credentials) { return userRepository.findByEmail(credentials.getEmail()); }
}
