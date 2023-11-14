package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="roles")
public class RoleEntity {
    @Id Role.Id id;
    @Column(name="role") Role.Description description;

    public RoleEntity(){ }
    public Role.Id getId() {
        return id;
    }

    public void setId(Role.Id id) {
        this.id = id;
    }

    public Role.Description getDescription() {
        return description;
    }

    public void setDescription(Role.Description description) {
        this.description = description;
    }
}
