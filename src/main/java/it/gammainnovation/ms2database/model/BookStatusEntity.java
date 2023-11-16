package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.BookStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="book_status")
public class BookStatusEntity {
    @Id
    String id;
    String description;

    public BookStatusEntity (){ }
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
