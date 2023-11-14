package it.gammainnovation.ms2database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="booking_reading_room")
public class ReadingRoomBookingEntity {
    @Id @GeneratedValue int id;
    @Column(name="user_id") String userId;
    @Column(name="reading_room_id")String readingRoomId;
    @Column(name="turn_read_room_id") String turnId;
    Date day;

    public ReadingRoomBookingEntity(){ }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReadingRoomId() {
        return readingRoomId;
    }

    public void setReadingRoomId(String readingRoomId) {
        this.readingRoomId = readingRoomId;
    }

    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
