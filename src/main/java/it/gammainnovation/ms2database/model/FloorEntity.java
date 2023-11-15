package it.gammainnovation.ms2database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="floors")
public class FloorEntity {
    @Id int id;
    String name;

    public FloorEntity(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
