package com.booking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.dao.BookingRepository;
import com.booking.entities.Booking;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

}
