package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Travel_Insurance_Company")
public class Travel_Insurance_Company {

    public Travel_Insurance_Company() {
    }

    public Travel_Insurance_Company(int id, Company company) {
        this.id = id;
        this.company = company;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Insurance_Company")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Company")
    private Company company;

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
}
