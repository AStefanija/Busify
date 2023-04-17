package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Company")
public class Company {

    public Company() {
    }

    public Company(int id, String name, String address, LocalDate date_of_establishment, int number_of_employees) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.date_of_establishment = date_of_establishment;
        this.number_of_employees = number_of_employees;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Company")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Date_Of_Establishment")
    private LocalDate date_of_establishment;

    @Column(name = "Number_Of_Employees")
    private int number_of_employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDate_of_establishment() {
        return date_of_establishment;
    }

    public void setDate_of_establishment(LocalDate date_of_establishment) {
        this.date_of_establishment = date_of_establishment;
    }

    public int getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employees(int number_of_employees) {
        this.number_of_employees = number_of_employees;
    }
}
