package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.Country;


public interface CountryRepository extends JpaRepository<Country, Long> {

}
