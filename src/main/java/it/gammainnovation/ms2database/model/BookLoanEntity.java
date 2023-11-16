package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity(name = "loan_book")
public class BookLoanEntity {

    @Id @GeneratedValue int id;
    @ManyToOne @JoinColumn(name = "user_id") UserEntity user;
    @ManyToOne @JoinColumn(name = "book_id") BookEntity book;
    @ManyToOne @JoinColumn(name = "status")LoanStatusEntity status;
    @Column(name="start_loan") Date startLoan;
    @Column(name="end_loan") Date endLoan;

    public BookLoanEntity (){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public LoanStatusEntity getStatus() {
        return status;
    }

    public void setStatus(LoanStatusEntity status) {
        this.status = status;
    }

    public Date getStartLoan() {
        return startLoan;
    }

    public void setStartLoan(Date startLoan) {
        this.startLoan = startLoan;
    }

    public Date getEndLoan() {
        return endLoan;
    }

    public void setEndLoan(Date endLoan) {
        this.endLoan = endLoan;
    }
}
