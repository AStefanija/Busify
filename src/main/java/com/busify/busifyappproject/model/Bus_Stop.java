package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Bus_Stop")
public class Bus_Stop {

    public Bus_Stop() {
    }

    public Bus_Stop(int id, Route route, String city) {
        this.id = id;
        this.route = route;
        this.city = city;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Bus_Stop")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Route")
    private Route route;

    @Column(name = "City")
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
