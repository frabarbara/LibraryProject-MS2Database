package it.gammainnovation.ms2database.repositories;

import it.gammainnovation.ms2database.model.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public int signUp(UserEntity newUser) {
        System.out.println("[MS3UserRepository: signUp(UserEntity)] entered method");

        int updated = entityManager.createNativeQuery(
                "INSERT INTO " +
                        "users (uuid, taxidcode, name, surname, birthday, gender, address, email, phone_number, password) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
        )
                .setParameter(1, newUser.getUuid())
                .setParameter(2, newUser.getTaxIdCode())
                .setParameter(3, newUser.getName())
                .setParameter(4, newUser.getSurname())
                .setParameter(5, newUser.getBirthday())
                .setParameter(6, newUser.getGender())
                .setParameter(7, newUser.getAddress())
                .setParameter(8, newUser.getEmail())
                .setParameter(9, newUser.getPhoneNumber())
                .setParameter(10, newUser.getPassword())
                .executeUpdate();

        System.out.println("[MS3UserRepository: signUp(UserEntity)] updated " + updated + " records");
        return updated;
    }

}
