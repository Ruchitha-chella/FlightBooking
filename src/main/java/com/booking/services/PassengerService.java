package com.booking.services;

import java.util.List;

import com.booking.entities.Passenger;

public interface PassengerService {
	public abstract List<Passenger> getAllPassengers();
    public abstract Passenger getPassengerById(Long passengerId);
    public abstract Passenger addPassenger(Passenger passenger);
    public abstract void deletePassengerById(Long passengerId);

}
