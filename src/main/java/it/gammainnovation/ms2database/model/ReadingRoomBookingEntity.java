package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="booking_reading_room")
public class ReadingRoomBookingEntity {
    @Id @GeneratedValue int id;
    @ManyToOne @JoinColumn(name = "user_id")UserEntity user;
    @ManyToOne @Column(name="reading_room_id") ReadingRoomEntity readingRoom;
    @ManyToOne @Column(name="turn_restaurant_id") RestaurantTurnEntity turn;
    Date day;

    public ReadingRoomBookingEntity(){ }
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

    public ReadingRoomEntity getReadingRoom() {
        return readingRoom;
    }

    public void setReadingRoom(ReadingRoomEntity readingRoom) {
        this.readingRoom = readingRoom;
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
