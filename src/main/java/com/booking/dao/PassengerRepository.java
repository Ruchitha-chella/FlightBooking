package com.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
