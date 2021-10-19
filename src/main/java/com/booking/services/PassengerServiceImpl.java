package com.booking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.dao.PassengerRepository;
import com.booking.entities.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
    private PassengerRepository passengerRepository;
	
	@Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(Long passengerId) {
        return passengerRepository.findById(passengerId).orElse(null);
    }

    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public void deletePassengerById(Long passengerId) {
        passengerRepository.deleteById(passengerId);
    }

}
