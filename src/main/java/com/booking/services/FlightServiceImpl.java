package com.booking.services;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.dao.FlightRepository;
import com.booking.entities.Airport;
import com.booking.entities.Flight;



@Service
@Transactional
public class FlightServiceImpl implements FlightService{
	@Autowired
	private FlightRepository flightRepository;
	
	 @Override
	    public List<Flight> getAllFlights() {
	        return flightRepository.findAll();
	    }

	    @Override
	    public Flight getFlightById(long flightId) {
	        return flightRepository.findById(flightId).orElse(null);
	    }

	    @Override
	    public Flight addFlight(Flight flight) {
	        return flightRepository.save(flight);
	    }

	    @Override
	    public void deleteFlightByRoute(String flightNumber) {
	    	flightRepository.deleteByFlightNumber(flightNumber);
	    }

	    @Override
	    public List<Flight> getAllFlightsByAirportAndDepartureTime(Airport depAirport, Airport destAirport, LocalDate depDate) {
	        return flightRepository.findAllByDepartureAirportEqualsAndDestinationAirportEqualsAndDepartureDateEquals(depAirport, destAirport, depDate);
	    }
		
	

}
