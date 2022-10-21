package com.flight.booking.service;
import java.util.List;

import com.flight.booking.model.Flights;
import com.flight.booking.repository.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlightsServiceImpl implements FlightsService {
	@Autowired
	private FlightsRepository flightsRepository;

	
	@Override
	public Flights saveFlights(Flights flights) {
		
		return flightsRepository.save(flights);
	}


	public void deleteFlights(Integer id) {
		flightsRepository.deleteById(id);
	}

	public Flights editFlights(Integer id, Flights flights) {
		Flights old = flightsRepository.findById(id).get();
		old.edit(flights);
		return saveFlights(old);
	}


	@Override
	public Flights findFlights(Integer id) {
		return flightsRepository.findById(id).get();
	}

	@Override
	public List<Flights> getAllFlights() {
		return flightsRepository.findAll();
	}





	
}
