package it.gammainnovation.ms2database.services.user;

import it.gammainnovation.ms2database.model.UserEntity;

public interface UserServiceInterface {
    public UserEntity signup(UserEntity newUser);
    public UserEntity login(UserEntity credentials);
}
