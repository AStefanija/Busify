package com.busify.repository;

import com.busify.model.Passenger;
import com.busify.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
    @Query("SELECT p FROM Passenger p WHERE p.user = :user")
    Passenger findByUser(User user);
}
