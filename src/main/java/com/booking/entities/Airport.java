package com.booking.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="airport")
public class Airport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airportid")
	private int airportId;
    private String airportCode;
    private String airportName;
    private String city;
    private String state;
    private String country;
    
    
    @OneToMany(mappedBy = "departureAirport")
    private Set<Flight> flight = new HashSet<>();
    
   public Airport(String airportCode, String airportName, String city, String state, String country) {
       this.airportCode = airportCode;
       this.airportName = airportName;
       this.city = city;
       this.state = state;
       this.country = country;
   }

	public int getAirportId() {
		return airportId;
	}

	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
	@JsonIgnore
	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}
    
    

}
