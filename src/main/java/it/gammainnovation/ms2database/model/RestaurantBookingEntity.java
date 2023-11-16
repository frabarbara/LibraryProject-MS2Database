package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="booking_restaurant")
public class RestaurantBookingEntity {
    @Id @GeneratedValue int id;
    @ManyToOne @JoinColumn(name = "user_id")UserEntity user;
    @ManyToOne @JoinColumn(name = "restaurant_id")RestaurantEntity restaurant;
    @ManyToOne @Column(name="turn_restaurant_id") RestaurantTurnEntity turn;
    Date day;

    public RestaurantBookingEntity(){ };
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public RestaurantEntity getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantEntity restaurant) {
        this.restaurant = restaurant;
    }

    public RestaurantTurnEntity getTurn() {
        return turn;
    }

    public void setTurn(RestaurantTurnEntity turn) {
        this.turn = turn;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
