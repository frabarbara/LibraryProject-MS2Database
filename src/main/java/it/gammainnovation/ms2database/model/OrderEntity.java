package it.gammainnovation.ms2database.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity(name="orders")
public class OrderEntity {
    @Id @GeneratedValue int id;
    @ManyToOne @JoinColumn(name="waiter_id") WaiterEntity waiter;
    @ManyToOne @JoinColumn(name="daily_menu") DailyMenuEntity dailyMenu;
    @Column(name="fc1_amt") int fc1Amt;
    @Column(name="fc2_amt") int fc2Amt;
    @Column(name="fc3_amt") int fc3Amt;
    @Column(name="sc1_amt") int sc1Amt;
    @Column(name="sc2_amt") int sc2Amt;
    @Column(name="sc3_amt") int sc3Amt;
    @Column(name="fru_amt") int fruAmt;
    @Column(name="des_amt") int desAmt;
    @Column(name="tot_bill") float totBill;
    String notes;
    LocalDateTime time;

    public OrderEntity(){ }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WaiterEntity getWaiter() {
        return waiter;
    }

    public void setWaiter(WaiterEntity waiter) {
        this.waiter = waiter;
    }

    public DailyMenuEntity getDailyMenu() {
        return dailyMenu;
    }

    public void setDailyMenu(DailyMenuEntity dailyMenu) {
        this.dailyMenu = dailyMenu;
    }

    public int getFc1Amt() {
        return fc1Amt;
    }

    public void setFc1Amt(int fc1Amt) {
        this.fc1Amt = fc1Amt;
    }

    public int getFc2Amt() {
        return fc2Amt;
    }

    public void setFc2Amt(int fc2Amt) {
        this.fc2Amt = fc2Amt;
    }

    public int getFc3Amt() {
        return fc3Amt;
    }

    public void setFc3Amt(int fc3Amt) {
        this.fc3Amt = fc3Amt;
    }

    public int getSc1Amt() {
        return sc1Amt;
    }

    public void setSc1Amt(int sc1Amt) {
        this.sc1Amt = sc1Amt;
    }

    public int getSc2Amt() {
        return sc2Amt;
    }

    public void setSc2Amt(int sc2Amt) {
        this.sc2Amt = sc2Amt;
    }

    public int getSc3Amt() {
        return sc3Amt;
    }

    public void setSc3Amt(int sc3Amt) {
        this.sc3Amt = sc3Amt;
    }

    public int getFruAmt() {
        return fruAmt;
    }

    public void setFruAmt(int fruAmt) {
        this.fruAmt = fruAmt;
    }

    public int getDesAmt() {
        return desAmt;
    }

    public void setDesAmt(int desAmt) {
        this.desAmt = desAmt;
    }

    public float getTotBill() {
        return totBill;
    }

    public void setTotBill(float totBill) {
        this.totBill = totBill;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
