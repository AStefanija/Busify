package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Coupon")
public class Coupon {

    public Coupon() {
    }

    public Coupon(int id, Passenger passenger, Route route, int points) {
        this.id = id;
        this.passenger = passenger;
        this.route = route;
        this.points = points;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Coupon")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Passenger")
    private Passenger passenger;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Route")
    private Route route;

    @Column(name = "Points")
    private int points;

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

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
