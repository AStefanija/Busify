package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Price")
public class Price {

    public Price() {
    }

    public Price(int id, Bus_Stop start_bus_stop, Bus_Stop end_bus_stop, float price) {
        this.id = id;
        this.start_bus_stop = start_bus_stop;
        this.end_bus_stop = end_bus_stop;
        this.price = price;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Price")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Start_Bus_Stop")
    private Bus_Stop start_bus_stop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "End_Bus_Stop")
    private Bus_Stop end_bus_stop;

    @Column(name = "Price")
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus_Stop getStart_bus_stop() {
        return start_bus_stop;
    }

    public void setStart_bus_stop(Bus_Stop start_bus_stop) {
        this.start_bus_stop = start_bus_stop;
    }

    public Bus_Stop getEnd_bus_stop() {
        return end_bus_stop;
    }

    public void setEnd_bus_stop(Bus_Stop end_bus_stop) {
        this.end_bus_stop = end_bus_stop;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
