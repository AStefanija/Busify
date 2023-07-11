package com.busify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Baggage")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Baggage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Baggage")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Ticket")
    private Ticket ticket;

    @Column(name = "Weight")
    private float weight;

    @Column(name = "Size")
    private float size;

    @Enumerated
    @Column(name = "Type")
    private BaggageType type;
}
