package com.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.entities.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
