package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="roles")
public class RoleEntity {
    @Id String id;
    @Column(name="role") String description;

    public RoleEntity(){ }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
