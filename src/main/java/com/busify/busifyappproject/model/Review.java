package com.busify.busifyappproject.model;

import javax.persistence.*;


@Entity
@Table(name = "Review")
public class Review {

    public Review() {
    }

    public Review(int id, Tour tour, Passenger passenger, float rating, String feedback) {
        this.id = id;
        this.tour = tour;
        this.passenger = passenger;
        this.rating = rating;
        this.feedback = feedback;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_Review")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Tour")
    private Tour tour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Passenger")
    private Passenger passenger;

    @Column(name = "Rating")
    private float rating;

    @Column(name = "Feedback")
    private String feedback;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
