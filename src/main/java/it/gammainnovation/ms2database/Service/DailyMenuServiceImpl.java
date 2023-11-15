package it.gammainnovation.ms2database.Service;

import it.gammainnovation.ms2database.model.DailyMenuEntity;
import it.gammainnovation.ms2database.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyMenuServiceImpl implements DailyMenuService{

    MenuRepository menuRepository;

    @Autowired
    public DailyMenuServiceImpl(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }
    @Override
    public DailyMenuEntity getDailyMenu() {
        DailyMenuEntity dailyMenuEntity =  menuRepository.getDailyMenu();
        return dailyMenuEntity;
    }
}
