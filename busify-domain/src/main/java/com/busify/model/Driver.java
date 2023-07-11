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
import java.time.LocalDate;


@Entity
@Table(name = "Driver")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Driver")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Bus_Company")
    private BusCompany bus_company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_User")
    private User user;

    @Column(name = "Driver_License")
    private String driver_license;

    @Column(name = "Date_Of_Employment")
    private LocalDate date_of_employment;
}
