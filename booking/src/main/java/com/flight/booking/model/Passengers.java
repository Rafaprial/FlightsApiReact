package com.flight.booking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passengers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String completeName;
	private String nationality;
	private String nifOrPassport;
	private String age;
	private boolean luggage;
	
	public Passengers(String completeName, String nationality, String nifOrPassport, String age, boolean luggage) {
		super();
		this.completeName = completeName;
		this.nationality = nationality;
		this.nifOrPassport = nifOrPassport;
		this.age = age;
		this.luggage = luggage;
	}

	public Passengers() {
		super();
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNifOrPassport() {
		return nifOrPassport;
	}

	public void setNifOrPassport(String nifOrPassport) {
		this.nifOrPassport = nifOrPassport;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public boolean isLuggage() {
		return luggage;
	}

	public void setLuggage(boolean luggage) {
		this.luggage = luggage;
	}

	public int getId() {
		return id;
	}

    public void edit(Passengers passengers) {
		this.age = passengers.getAge();
		this.completeName = passengers.getCompleteName();
		this.luggage = passengers.isLuggage();
		this.nationality = passengers.getNationality();
		this.nifOrPassport = passengers.getNifOrPassport();
    }
}
