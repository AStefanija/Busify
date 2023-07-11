package com.busify.repository;

import com.busify.model.BusCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusCompanyRepository extends JpaRepository<BusCompany,Integer> {
}
