package com.booking.services;

import java.util.List;

import com.booking.entities.Airport;

public interface AirportService {
    
    public abstract List<Airport> getAllAirports();
    public abstract Airport getAirportById(Integer airportId);
    public abstract Airport addAirport(Airport airport);
    public abstract void deleteAirport(Integer airpportId);
}
