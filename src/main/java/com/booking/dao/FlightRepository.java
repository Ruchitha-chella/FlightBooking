package com.booking.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.entities.Airport;
import com.booking.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByDepartureAirportEqualsAndDestinationAirportEqualsAndDepartureDateEquals(Airport depAirport, Airport destAirport, LocalDate depDate);
    void deleteByFlightNumber(String flightNumber);
}
