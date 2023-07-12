package com.busify.repository;

import com.busify.model.Passenger;
import com.busify.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

    @Query("SELECT t FROM Ticket t WHERE t.passenger = :passenger")
    List<Ticket> getAllFutureTicketsForUser(Passenger passenger);

}
