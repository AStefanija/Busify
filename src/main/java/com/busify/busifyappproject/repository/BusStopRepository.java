package com.busify.busifyappproject.repository;

import com.busify.busifyappproject.model.Bus_Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusStopRepository extends JpaRepository<Bus_Stop,Integer> {
}
