package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.BookStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="book_status")
public class BookStatusEntity {
    @Id
    BookStatus.Id id;
    BookStatus.Description description;

    public BookStatusEntity (){ }
    public BookStatus.Id getId() {
        return id;
    }

    public void setId(BookStatus.Id id) {
        this.id = id;
    }

    public BookStatus.Description getDescription() {
        return description;
    }

    public void setDescription(BookStatus.Description description) {
        this.description = description;
    }
}
