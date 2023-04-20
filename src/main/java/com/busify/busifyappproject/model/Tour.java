package com.busify.busifyappproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "Tour")
@AllArgsConstructor
@Builder
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
