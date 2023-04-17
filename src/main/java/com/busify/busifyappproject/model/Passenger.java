package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Passenger")
public class Passenger {

    public Passenger() {
    }

    public Passenger(int id, User user) {
        this.id = id;
        this.user = user;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Passenger")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_User")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
