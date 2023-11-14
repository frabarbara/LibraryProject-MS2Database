package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.LoanStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="loan_status")
public class LoanStatusEntity {
    @Id LoanStatus.Id id;
    LoanStatus.Description description;

    public LoanStatusEntity(){ }
    public LoanStatus.Id getId() {
        return id;
    }

    public void setId(LoanStatus.Id id) {
        this.id = id;
    }

    public LoanStatus.Description getDescription() {
        return description;
    }

    public void setDescription(LoanStatus.Description description) {
        this.description = description;
    }
}
