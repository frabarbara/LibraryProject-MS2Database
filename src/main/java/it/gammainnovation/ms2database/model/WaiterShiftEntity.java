package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Waiter;
import jakarta.persistence.*;

@Entity(name="waiters_shifts")
public class WaiterShiftEntity {
    @Id @GeneratedValue int id;
    @ManyToOne @JoinColumn(name = "res_shift")RestaurantShiftEntity restaurantShift;
    @ManyToOne @JoinColumn(name = "waiter") WaiterEntity waiter;

    public WaiterShiftEntity(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RestaurantShiftEntity getRestaurantShift() {
        return restaurantShift;
    }

    public void setRestaurantShift(RestaurantShiftEntity restaurantShift) {
        this.restaurantShift = restaurantShift;
    }

    public WaiterEntity getWaiter() {
        return waiter;
    }

    public void setWaiter(WaiterEntity waiter) {
        this.waiter = waiter;
    }
}
