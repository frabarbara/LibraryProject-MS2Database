package it.gammainnovation.ms2database.services.restaurant;

import it.gammainnovation.librarymodel.RestaurantTurn;
import it.gammainnovation.ms2database.model.RestaurantTurnEntity;

import java.util.List;

public interface RestTurnServiceInterface {
    List<RestaurantTurnEntity> getRestaurantTurns();
}
