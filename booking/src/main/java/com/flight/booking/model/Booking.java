package com.flight.booking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String origin;
	private String destination;
	private boolean oneWay;
	private String oneWayTrip;
	private String comeBackTrip;
	
	public Booking( String origin, String destination, boolean oneWay, String oneWayTrip,
			String comeBackTrip) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.oneWay = oneWay;
		this.oneWayTrip = oneWayTrip;
		this.comeBackTrip = comeBackTrip;
	}
	
	public Booking( String origin, String destination, boolean oneWay, String oneWayTrip) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.oneWay = oneWay;
		this.oneWayTrip = oneWayTrip;
	}
	
	public Booking() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean isOneWay() {
		return oneWay;
	}
	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}
	public String getOneWayTrip() {
		return oneWayTrip;
	}
	public void setOneWayTrip(String oneWayTrip) {
		this.oneWayTrip = oneWayTrip;
	}
	public String getComeBackTrip() {
		return comeBackTrip;
	}
	public void setComeBackTrip(String comeBackTrip) {
		this.comeBackTrip = comeBackTrip;
	}

	public void edit(Booking booking) {
		this.comeBackTrip = booking.getComeBackTrip();
		this.destination = booking.getDestination();
		this.oneWay = booking.isOneWay();
		this.oneWayTrip = booking.getOneWayTrip();
		this.origin = booking.getOrigin();

		
	}

	
}
