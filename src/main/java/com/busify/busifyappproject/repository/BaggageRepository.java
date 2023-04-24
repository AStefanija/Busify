package com.busify.busifyappproject.repository;

import com.busify.busifyappproject.model.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaggageRepository extends JpaRepository<Baggage, Integer> {
    // custom repository methods here
}
