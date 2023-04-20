package com.busify.busifyappproject.model;

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


@Entity
@Table(name = "Price")
@NoArgsConstructor
@Builder
@Data
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
