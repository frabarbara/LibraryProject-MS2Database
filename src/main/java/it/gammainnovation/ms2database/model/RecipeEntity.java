package it.gammainnovation.ms2database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="all_recipes")
public class RecipeEntity {
    /* #################### PROPERTIES #################### */
    @Id @GeneratedValue int id;
    private String name;
    private String description;
    @Column(name="amt_ordered") private int amtOrdered;
    @Column(name="months_proposed") private int monthsProposed;
    @Column(name="cur_price") private double curPrice;
    @Column(name="in_monthly_rotation") private boolean inMonthlyRotation;
    @Column(name="last_used") private Date lastUsed;

    /* #################### CONSTRUCTORS #################### */
    public RecipeEntity(){ }

    /* #################### PRIVATE METHODS #################### */
    /* #################### GETTERS / SETTERS #################### */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmtOrdered() {
        return amtOrdered;
    }

    public void setAmtOrdered(int amtOrdered) {
        this.amtOrdered = amtOrdered;
    }

    public int getMonthsProposed() {
        return monthsProposed;
    }

    public void setMonthsProposed(int monthsProposed) {
        this.monthsProposed = monthsProposed;
    }

    public double getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(double curPrice) {
        this.curPrice = curPrice;
    }

    public boolean isInMonthlyRotation() {
        return inMonthlyRotation;
    }

    public void setInMonthlyRotation(boolean inMonthlyRotation) {
        this.inMonthlyRotation = inMonthlyRotation;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date last_used) {
        this.lastUsed = last_used;
    }

    /* #################### PUBLIC METHODS #################### */

    public double getAppreciationIndex() {
        return this.amtOrdered / (double)this.monthsProposed;
    }
}
