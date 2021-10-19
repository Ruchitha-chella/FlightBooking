package com.booking.services;


import java.time.LocalDate;
import java.util.List;
import com.booking.entities.Airport;
import com.booking.entities.Flight;

public interface FlightService {
	public abstract List<Flight> getAllFlights();
    public abstract Flight getFlightById(long flightId);
    public abstract Flight addFlight(Flight flight);
    public void deleteFlightByRoute(String flightNumber);
    public abstract List<Flight> getAllFlightsByAirportAndDepartureTime(Airport depAirport, Airport destAirport, LocalDate depDate);

}
