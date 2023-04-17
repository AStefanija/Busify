package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Bus_Company")
public class Bus_Company {

    public Bus_Company() {
    }

    public Bus_Company(int id, Company company, int number_of_buses) {
        this.id = id;
        this.company = company;
        this.number_of_buses = number_of_buses;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Bus_Company")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Company")
    private Company company;

    @Column(name = "Number_Of_Buses")
    private int number_of_buses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getNumber_of_buses() {
        return number_of_buses;
    }

    public void setNumber_of_buses(int number_of_buses) {
        this.number_of_buses = number_of_buses;
    }
}
