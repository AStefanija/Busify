package com.busify.busifyappproject.repository;

import com.busify.busifyappproject.model.Travel_Insurance_Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelInsuranceCompanyRepository extends JpaRepository<Travel_Insurance_Company,Integer> {
}
