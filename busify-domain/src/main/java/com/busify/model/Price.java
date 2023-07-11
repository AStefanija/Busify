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


@Entity
@Table(name = "Price")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Price")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Start_Bus_Stop")
    private BusStop start_bus_stop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "End_Bus_Stop")
    private BusStop end_bus_stop;

    @Column(name = "Price")
    private float price;
}
