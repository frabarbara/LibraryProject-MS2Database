package it.gammainnovation.ms2database.repositories;


import it.gammainnovation.librarymodel.DailyMenu;
import it.gammainnovation.librarymodel.Recipe;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.model.RecipeEntity;
import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;


public interface MenuRepository extends JpaRepository<DailyMenuEntity,Integer> {

    DailyMenuEntity findDailyMenuEntityByDay(Date day);

    @Query(value="select all_recipes.* from all_recipes join daily_menu on (all_recipes.id = daily_menu.first_course1 or all_recipes.id = daily_menu.first_course2 or all_recipes.id = daily_menu.first_course3 or all_recipes.id = daily_menu.second_course1 or all_recipes.id = daily_menu.second_course2 or all_recipes.id = daily_menu.second_course3 or all_recipes.id = daily_menu.fruit or all_recipes.id = daily_menu.dessert) where daily_menu.day = ?1", nativeQuery = true)
    Iterable<Recipe> findDailyMenuRecipesByDay(Date day);
}
