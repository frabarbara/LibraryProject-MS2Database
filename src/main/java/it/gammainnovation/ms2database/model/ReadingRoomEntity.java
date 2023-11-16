package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;
import org.aspectj.lang.annotation.control.CodeGenerationHint;

@Entity(name="reading_rooms")
public class ReadingRoomEntity {
    @Id String id;
    @ManyToOne @JoinColumn(name="floor_id") FloorEntity floor;
    int num_seats;
    String name;

    public ReadingRoomEntity(){ }
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

    public int getNum_seats() {
        return num_seats;
    }

    public void setNum_seats(int num_seats) {
        this.num_seats = num_seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
