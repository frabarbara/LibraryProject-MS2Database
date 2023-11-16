package it.gammainnovation.ms2database.repositories;

import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.RestaurantTurnEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTurnRepository extends JpaRepository<RestaurantTurnEntity,String> {

}
