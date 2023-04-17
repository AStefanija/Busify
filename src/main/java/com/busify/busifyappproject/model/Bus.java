package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Bus")
public class Bus {

    public Bus() {
    }

    public Bus(int id, Bus_Company bus_company, int number_of_seats) {
        this.id = id;
        this.bus_company = bus_company;
        this.number_of_seats = number_of_seats;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Bus")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Bus_Company")
    private Bus_Company bus_company;

    @Column(name = "Number_Of_Seats")
    private int number_of_seats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus_Company getBus_company() {
        return bus_company;
    }

    public void setBus_company(Bus_Company bus_company) {
        this.bus_company = bus_company;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }
}
