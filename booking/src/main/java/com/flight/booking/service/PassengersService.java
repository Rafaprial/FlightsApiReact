package com.flight.booking.service;

import com.flight.booking.model.Passengers;

import java.util.List;

public interface PassengersService {

	Passengers savePassengers(Passengers passengers);

	Passengers editPassengers(Integer id, Passengers passengers);

	List<Passengers> getAllPassengers();


	void deletePassengers(Integer id);

	Passengers findPassengers(Integer id);

}
