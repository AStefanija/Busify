package com.busify.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Baggage")
@NoArgsConstructor
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

    public Baggage(Ticket ticket, float weight, float size, BaggageType type) {
        this.ticket = ticket;
        this.weight = weight;
        this.size = size;
        this.type = type;
    }
}
