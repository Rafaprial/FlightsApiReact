package com.flight.booking.controller;

import com.flight.booking.model.Passengers;
import com.flight.booking.service.PassengersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping("/passengers")
@CrossOrigin
public class PassengersController {
	@Autowired
	private PassengersService passengerService;

	@PostMapping("/create")
	public String register(@RequestBody Passengers passengers) {

		passengerService.savePassengers(passengers);
		return "passengers has been added";
	}

	@GetMapping("/getAll")
	public List<Passengers> getAllPassengerss() {
		return passengerService.getAllPassengers();
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<Passengers> remove(@PathVariable Integer id) {
		try {
			Passengers passengers = passengerService.findPassengers(id);
			passengerService.deletePassengers(id);
			return new ResponseEntity<Passengers>(passengers, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Passengers>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/edit/{id}")
	public ResponseEntity<Passengers> edit(@PathVariable Integer id, @RequestBody Passengers passenger) {
		try {
			passengerService.editPassengers(id, passenger);
			return new ResponseEntity<Passengers>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Passengers>(passenger, HttpStatus.NOT_FOUND);
		}
	}
}
