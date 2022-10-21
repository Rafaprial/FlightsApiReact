package com.flight.booking.service;

import com.flight.booking.model.Passengers;
import com.flight.booking.repository.PassengersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PassengersServiceImpl implements PassengersService {
	@Autowired
	private PassengersRepository passengersRepository;

	
	@Override
	public Passengers savePassengers(Passengers passengers) {
		
		return passengersRepository.save(passengers);
	}


	public void deletePassengers(Integer id) {
		passengersRepository.deleteById(id);
	}

	public Passengers editPassengers(Integer id, Passengers passengers) {
		Passengers old = passengersRepository.findById(id).get();
		old.edit(passengers);
		return savePassengers(old);
	}


	@Override
	public Passengers findPassengers(Integer id) {
		return passengersRepository.findById(id).get();
	}

	@Override
	public List<Passengers> getAllPassengers() {
		return passengersRepository.findAll();
	}





	
}
