package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Ticket")
public class Ticket {

    public Ticket() {
    }

    public Ticket(int id, Passenger passenger, Price price, int seat) {
        this.id = id;
        this.passenger = passenger;
        this.price = price;
        this.seat = seat;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Ticket")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Passenger")
    private Passenger passenger;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Price")
    private Price price;

    @Column(name = "Seat")
    private int seat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
