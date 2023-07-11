package com.busify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "Tour")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
