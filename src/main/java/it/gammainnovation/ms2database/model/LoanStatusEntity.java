package it.gammainnovation.ms2database.model;

import it.gammainnovation.librarymodel.LoanStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="loan_status")
public class LoanStatusEntity {
    @Id String id;
    String description;

    public LoanStatusEntity(){ }
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
