package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Theme;
import jakarta.persistence.*;

@Entity(name="books_rooms")
public class BooksRoomEntity {
    @Id String id;
    @ManyToOne @JoinColumn(name = "floor_id") FloorEntity floor;
    @ManyToOne @JoinColumn(name = "theme") ThemeEntity theme;

    public BooksRoomEntity(){ }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FloorEntity getFloor() {
        return floor;
    }

    public void setFloor(FloorEntity floor) {
        this.floor = floor;
    }

    public ThemeEntity getTheme() {
        return theme;
    }

    public void setTheme(ThemeEntity theme) {
        this.theme = theme;
    }
}
