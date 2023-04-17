package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Invoice")
public class Invoice {

    public Invoice() {
    }

    public Invoice(int id, Ticket ticket, LocalDate date, LocalTime time) {
        this.id = id;
        this.ticket = ticket;
        Date = date;
        this.time = time;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Invoice")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Ticket")
    private Ticket ticket;

    @Column(name = "Date")
    private LocalDate Date;

    @Column(name = "Time")
    private LocalTime time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
