package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Theme;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="themes")
public class ThemeEntity {
    @Id String id;
    @Column(name="name") String description;

    public ThemeEntity(){ }
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
