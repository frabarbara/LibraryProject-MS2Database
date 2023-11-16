package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

@Entity(name="receptions")
public class ReceptionEntity {
    @Id String id;
    String name;
    @ManyToOne @JoinColumn(name="floor_id") FloorEntity floor;

    public ReceptionEntity(){ }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}
