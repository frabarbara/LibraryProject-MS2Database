package it.gammainnovation.ms2database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="restaurants")
public class RestaurantEntity {
    /* #################### PROPERTIES #################### */
    @Id private String id;
    @Column(name="floor_id") private int floor;
    @Column(name="num_seats") int numSeats;
    String name;

    /* #################### CONSTRUCTORS #################### */
    public RestaurantEntity(){ }
    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /* #################### PUBLIC METHODS #################### */
}
