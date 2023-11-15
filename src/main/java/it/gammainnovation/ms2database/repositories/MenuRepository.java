package it.gammainnovation.ms2database.repositories;


import it.gammainnovation.librarymodel.DailyMenu;
import it.gammainnovation.ms2database.model.DailyMenuEntity;
import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MenuRepository extends JpaRepository<DailyMenuEntity,Integer> {

    @Query(value = "SELECT * FROM daily_menu", nativeQuery = true)
    DailyMenuEntity getDailyMenu();
}
