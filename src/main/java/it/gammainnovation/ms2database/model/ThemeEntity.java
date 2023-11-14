package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.Theme;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="themes")
public class ThemeEntity {
    @Id Theme.Id id;
    @Column(name="name") Theme.Description description;

    public ThemeEntity(){ }
    public Theme.Id getId() {
        return id;
    }

    public void setId(Theme.Id id) {
        this.id = id;
    }

    public Theme.Description getDescription() {
        return description;
    }

    public void setDescription(Theme.Description description) {
        this.description = description;
    }
}
