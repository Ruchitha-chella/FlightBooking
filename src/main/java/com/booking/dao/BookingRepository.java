package com.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.booking.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
