package it.gammainnovation.ms2database.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity(name="maintenance")
public class MaintenanceEntity {
    @Id @GeneratedValue int id;
    @ManyToOne @JoinColumn(name="room_id") ReadingRoomEntity room;
    @Column(name="start_maintenance") Date startMaintenance;
    @Column(name="end_maintenance") int duration;

    public MaintenanceEntity(){ }

    public ReadingRoomEntity getRoom() {
        return room;
    }

    public void setRoom(ReadingRoomEntity room) {
        this.room = room;
    }

    public Date getStartMaintenance() {
        return startMaintenance;
    }

    public void setStartMaintenance(Date startMaintenance) {
        this.startMaintenance = startMaintenance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
