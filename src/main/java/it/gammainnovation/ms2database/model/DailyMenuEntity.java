package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="daily_menu")
public class DailyMenuEntity {
    @Id @GeneratedValue int id;
    Date day;
    @ManyToOne @JoinColumn(name="first_course1") RecipeEntity fc1;
    @ManyToOne @JoinColumn(name="first_course2") RecipeEntity fc2;
    @ManyToOne @JoinColumn(name="first_course3") RecipeEntity fc3;
    @ManyToOne @JoinColumn(name="second_course1") RecipeEntity sc1;
    @ManyToOne @JoinColumn(name="second_course2") RecipeEntity sc2;
    @ManyToOne @JoinColumn(name="second_course3") RecipeEntity sc3;
    @ManyToOne @JoinColumn(name="fruit") RecipeEntity fru;
    @ManyToOne @JoinColumn(name="dessert") RecipeEntity des;
    String notes;

    public DailyMenuEntity(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public RecipeEntity getFc1() {
        return fc1;
    }

    public void setFc1(RecipeEntity fc1) {
        this.fc1 = fc1;
    }

    public RecipeEntity getFc2() {
        return fc2;
    }

    public void setFc2(RecipeEntity fc2) {
        this.fc2 = fc2;
    }

    public RecipeEntity getFc3() {
        return fc3;
    }

    public void setFc3(RecipeEntity fc3) {
        this.fc3 = fc3;
    }

    public RecipeEntity getSc1() {
        return sc1;
    }

    public void setSc1(RecipeEntity sc1) {
        this.sc1 = sc1;
    }

    public RecipeEntity getSc2() {
        return sc2;
    }

    public void setSc2(RecipeEntity sc2) {
        this.sc2 = sc2;
    }

    public RecipeEntity getSc3() {
        return sc3;
    }

    public void setSc3(RecipeEntity sc3) {
        this.sc3 = sc3;
    }

    public RecipeEntity getFru() {
        return fru;
    }

    public void setFru(RecipeEntity fru) {
        this.fru = fru;
    }

    public RecipeEntity getDes() {
        return des;
    }

    public void setDes(RecipeEntity des) {
        this.des = des;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
