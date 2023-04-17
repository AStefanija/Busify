package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Tour")
public class Tour {

    public Tour() {
    }

    public Tour(int id, Driver driver, LocalDate date, TourStatus status, Route route) {
        this.id = id;
        this.driver = driver;
        this.date = date;
        this.status = status;
        this.route = route;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Tour")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Driver")
    private Driver driver;

    @Column(name = "Date")
    private LocalDate date;

    @Enumerated
    @Column(name = "Status")
    private TourStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Route")
    private Route route;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TourStatus getStatus() {
        return status;
    }

    public void setStatus(TourStatus status) {
        this.status = status;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
