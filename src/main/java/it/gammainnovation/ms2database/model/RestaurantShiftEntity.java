package it.gammainnovation.ms2database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="restaurant_shifts")
public class RestaurantShiftEntity {
    @Id String id;
    Date day;

    public RestaurantShiftEntity(){ }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
