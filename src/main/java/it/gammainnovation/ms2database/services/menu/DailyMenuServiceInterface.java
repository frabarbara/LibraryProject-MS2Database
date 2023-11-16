package it.gammainnovation.ms2database.services.menu;


import it.gammainnovation.librarymodel.Recipe;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.RecipeEntity;

import java.util.Date;

public interface DailyMenuServiceInterface {
    DailyMenuEntity getDailyMenu();
    Iterable<Recipe> findDailyMenuRecipesByDay(Date day);
}
