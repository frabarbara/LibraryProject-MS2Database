package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Theme;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="books_rooms")
public class BooksRoomEntity {
    @Id String id;
    @Column(name="floor_id") int floorId;
    String theme;

    public BooksRoomEntity(){ }
    public int getFloor() {
        return floorId;
    }

    public void setFloor(int floor) {
        this.floorId = floor;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
