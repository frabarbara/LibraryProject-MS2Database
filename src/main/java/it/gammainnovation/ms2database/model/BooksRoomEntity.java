package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Theme;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="books_rooms")
public class BooksRoomEntity {
    @Id String id;
    @Column(name="floor_id") int floorId;
    Theme.Id theme;

    public BooksRoomEntity(){ }
    public int getFloor() {
        return floorId;
    }

    public void setFloor(int floor) {
        this.floorId = floor;
    }

    public Theme.Id getTheme() {
        return theme;
    }

    public void setTheme(Theme.Id theme) {
        this.theme = theme;
    }
}
