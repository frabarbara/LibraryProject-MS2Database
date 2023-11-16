package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.BookStatus;
import it.gammainnovation.librarymodel.Theme;
import jakarta.persistence.*;

@Entity(name="books")
public class BookEntity {

    @Id String id;
    String isbn;
    String title;
    int edition;
    @ManyToOne @JoinColumn(name = "author") AuthorEntity author;
    @Column(name="pub_year") int pubYear;
    @ManyToOne @JoinColumn(name = "theme") ThemeEntity theme;
    boolean borrowable;
    @ManyToOne @JoinColumn(name = "status") BookStatusEntity status;

    public BookEntity() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public ThemeEntity getTheme() {
        return theme;
    }

    public void setTheme(ThemeEntity theme) {
        this.theme = theme;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    public BookStatusEntity getStatus() {
        return status;
    }

    public void setStatus(BookStatusEntity status) {
        this.status = status;
    }
}
