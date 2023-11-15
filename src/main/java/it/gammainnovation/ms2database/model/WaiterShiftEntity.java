package it.gammainnovation.ms2database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="waiters_shifts")
public class WaiterShiftEntity {
    @Id @GeneratedValue int id;
    @Column(name="res_shift") String restaurantShift;
    String waiter;

    public WaiterShiftEntity(){ }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantShift() {
        return restaurantShift;
    }

    public void setRestaurantShift(String restaurantShift) {
        this.restaurantShift = restaurantShift;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }
}
