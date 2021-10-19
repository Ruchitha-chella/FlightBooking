package com.booking.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.booking.entities.Booking;
import com.booking.entities.Flight;
import com.booking.services.AirportService;
import com.booking.services.BookingService;
import com.booking.services.FlightService;
import com.booking.services.PassengerService;



@RestController
public class MainController {
	@Autowired
    AirportService airportService;
    @Autowired
    FlightService flightService;
    @Autowired
    PassengerService passengerService;
    @Autowired
    BookingService bookingService;
    
    @PostMapping("/flight/stock/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Flight> addFlight(@Valid @RequestBody Flight flight) {
		Flight flight1 = flightService.addFlight(flight);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(flight1.getFlightId())
				.toUri();
		return ResponseEntity.created(location).body(flight1);
	}
    
    @DeleteMapping("/flight/airline/delete")
    public void deleteFlightByRoute(@RequestParam String flightNumber) {
    	flightService.deleteFlightByRoute(flightNumber);
    }
    
    @GetMapping("/flight/info/{id}")
	public Flight getFlightById(@RequestParam long flightId) {
		System.out.println(flightId);
		return flightService.getFlightById(flightId);
	}
    
    @PostMapping("/flight/booking/register")
    public Booking addBooking(@Valid @RequestBody Booking booking) {
    	return bookingService.addBooking(booking);
    }
    

	@GetMapping("/flight/getall")
    public List<Flight> getAllFlights() {
    	return flightService.getAllFlights();
    }
	

}
