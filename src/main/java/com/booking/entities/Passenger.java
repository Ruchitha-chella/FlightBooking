package com.booking.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passengerid")
	private long passengerId;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String phoneNumber;
	@NotNull
	private int passengerAge;
	@NotNull
	private String passportNumber;
	@NotNull
	private String email;
	@NotNull
	private Double luggage;
	@NotNull
	private String address;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="flightid", nullable=false)
    private Flight flight;
	
	 @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	 @JoinColumn(name="bookingId")
	 private Booking booking;
	 
//	 public Passenger( String firstName, String lastName, String phoneNumber, int passengerAge, String passportNumber, String email, Double luggage, String address) {
//	        this.firstName = firstName;
//	        this.lastName = lastName;
//	        this.phoneNumber = phoneNumber;
//	        this.passengerAge = passengerAge;
//	        this.passportNumber = passportNumber;
//	        this.email = email;
//	        this.luggage = luggage;
//	        this.address = address;
//	    }

	public long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getLuggage() {
		return luggage;
	}

	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@JsonIgnore
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@JsonIgnore
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
	
	

}
