package it.gammainnovation.ms2database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="authors")
public class AuthorEntity {

    /* #################### PROPERTIES #################### */

    @Id private String id;
    private String name;
    private String surname;
    private String nationality;
    private Date birthday;

    /* #################### CONSTRUCTORS #################### */

    public AuthorEntity() {}

    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /* #################### PUBLIC METHODS #################### */

}
