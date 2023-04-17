package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalTime;


@Entity
@Table(name = "Route")
public class Route {

    public Route() {
    }

    public Route(int id, Bus bus, String start_point, String end_point, LocalTime arrival_time, LocalTime departure_time, String distance, Bus_Company bus_company) {
        this.id = id;
        this.bus = bus;
        this.start_point = start_point;
        this.end_point = end_point;
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.distance = distance;
        this.bus_company = bus_company;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Route")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Bus")
    private Bus bus;

    @Column(name = "Start_Point")
    private String start_point;

    @Column(name = "End_Point")
    private String end_point;

    @Column(name = "Arrival_Time")
    private LocalTime arrival_time;

    @Column(name = "Departure_Time")
    private LocalTime departure_time;

    @Column(name = "Distance")
    private String distance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Bus_Company")
    private Bus_Company bus_company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getStart_point() {
        return start_point;
    }

    public void setStart_point(String start_point) {
        this.start_point = start_point;
    }

    public String getEnd_point() {
        return end_point;
    }

    public void setEnd_point(String end_point) {
        this.end_point = end_point;
    }

    public LocalTime getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(LocalTime arrival_time) {
        this.arrival_time = arrival_time;
    }

    public LocalTime getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(LocalTime departure_time) {
        this.departure_time = departure_time;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Bus_Company getBus_company() {
        return bus_company;
    }

    public void setBus_company(Bus_Company bus_company) {
        this.bus_company = bus_company;
    }
}
