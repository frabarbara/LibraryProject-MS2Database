package it.gammainnovation.ms2database.services.restaurant;

import it.gammainnovation.librarymodel.RestaurantTurn;
import it.gammainnovation.ms2database.model.RestaurantTurnEntity;
import it.gammainnovation.ms2database.repositories.RestaurantTurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestTurnService implements RestTurnServiceInterface{

    RestaurantTurnRepository restaurantTurnRepository;

    @Autowired
    public RestTurnService(RestaurantTurnRepository restaurantTurnRepository){
        this.restaurantTurnRepository = restaurantTurnRepository;
    }
    @Override
    public List<RestaurantTurnEntity> getRestaurantTurns() {
        List<RestaurantTurnEntity> restaurantTurns = restaurantTurnRepository.findAll();
        return null;
    }
}
