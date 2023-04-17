package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Driver")
public class Driver {

    public Driver() {
    }

    public Driver(int id, Bus_Company bus_company, User user, String driver_license, LocalDate date_of_employment) {
        this.id = id;
        this.bus_company = bus_company;
        this.user = user;
        this.driver_license = driver_license;
        this.date_of_employment = date_of_employment;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Driver")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Bus_Company")
    private Bus_Company bus_company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_User")
    private User user;

    @Column(name = "Driver_License")
    private String driver_license;

    @Column(name = "Date_Of_Employment")
    private LocalDate date_of_employment;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }

    public LocalDate getDate_of_employment() {
        return date_of_employment;
    }

    public void setDate_of_employment(LocalDate date_of_employment) {
        this.date_of_employment = date_of_employment;
    }
}
