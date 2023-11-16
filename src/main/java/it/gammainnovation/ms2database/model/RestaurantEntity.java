package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

@Entity(name="restaurants")
public class RestaurantEntity {
    /* #################### PROPERTIES #################### */
    @Id private String id;
    @ManyToOne @JoinColumn(name = "floor_id") private FloorEntity floor;
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

    public FloorEntity getFloor() {
        return floor;
    }

    public void setFloor(FloorEntity floor) {
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
