package com.flight.booking.service;

import java.util.List;

import com.flight.booking.model.Flights;

public interface FlightsService {

	Flights saveFlights(Flights booking);

	Flights editFlights(Integer id, Flights booking);

	List<Flights> getAllFlights();


	void deleteFlights(Integer id);

	Flights findFlights(Integer id);

}
