package com.booking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.dao.AirportRepository;
import com.booking.entities.Airport;

@Service
public class AirportServiceImpl implements AirportService {
	@Autowired
    private AirportRepository airportRepository;
	
	 @Override
	    public List<Airport> getAllAirports() {
	        return airportRepository.findAll();
	    }

	    @Override
	    public Airport getAirportById(Integer airportId) {
	        return airportRepository.findById(airportId).orElse(null);
	    }

	    @Override
	    public Airport addAirport(Airport airport) {
	        return airportRepository.save(airport);
	    }

	    @Override
	    public void deleteAirport(Integer airportId) {
	        airportRepository.deleteById(airportId);
	    }
	}
