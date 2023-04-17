package com.busify.busifyappproject.model;

import javax.persistence.*;

@Entity
@Table(name = "Baggage")
public class Baggage {

    public Baggage() {
    }

    public Baggage(int id, Ticket ticket, float weight, float size, BaggageType type) {
        this.id = id;
        this.ticket = ticket;
        this.weight = weight;
        this.size = size;
        this.type = type;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Baggage")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Ticket")
    private Ticket ticket;

    @Column(name = "Weight")
    private float weight;

    @Column(name = "Size")
    private float size;

    @Enumerated
    @Column(name = "Type")
    private BaggageType type;

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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public BaggageType getType() {
        return type;
    }

    public void setType(BaggageType type) {
        this.type = type;
    }
}
