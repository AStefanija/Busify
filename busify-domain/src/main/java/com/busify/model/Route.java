package com.busify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalTime;


@Entity
@Table(name = "Route")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private BusCompany bus_company;
}
