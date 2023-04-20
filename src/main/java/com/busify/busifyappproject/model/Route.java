package com.busify.busifyappproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
    private Bus_Company bus_company;
}
