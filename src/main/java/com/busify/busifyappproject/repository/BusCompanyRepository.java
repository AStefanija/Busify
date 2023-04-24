package com.busify.busifyappproject.repository;

import com.busify.busifyappproject.model.Bus_Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusCompanyRepository extends JpaRepository<Bus_Company,Integer> {
}
