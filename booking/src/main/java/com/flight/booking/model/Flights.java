package com.flight.booking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flights {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fromDestin;
	private String toDestin;
	private String datesOfFlight;
	
	public String getfromDestin() {
		return fromDestin;
	}

	public void setFrom(String fromDestin) {
		this.fromDestin = fromDestin;
	}

	public String gettoDestin() {
		return toDestin;
	}

	public void setToDestin(String toDestin) {
		this.toDestin = toDestin;
	}
	
	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flights(int id ,String from, String to, String dates) {
		super();
		this.fromDestin = from;
		this.toDestin = to;
		this.datesOfFlight = datesOfFlight;
	}
	public String getDatesOfFlight() {
		return datesOfFlight;
	}

	public void setDatesOfFlight(String datesOfFlight) {
		this.datesOfFlight = datesOfFlight;
	}

	public int getId() {
		return id;
	}

    public void edit(Flights flights) {
		this.datesOfFlight = flights.getDatesOfFlight();
		this.fromDestin = flights.getfromDestin();
		this.toDestin = flights.gettoDestin();
	}
}
