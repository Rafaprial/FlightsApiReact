package com.flight.booking.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.model.Flights;
import com.flight.booking.service.FlightsService;
import com.flight.booking.service.FlightsService;

@RestController
@RequestMapping("/flights")
@CrossOrigin
public class FlightsController {
	@Autowired
	private FlightsService flightService;

	@PostMapping("/create")
	public String register(@RequestBody Flights booking) {

		flightService.saveFlights(booking);
		return "booking has been added";
	}

	@GetMapping("/getAll")
	public List<Flights> getAllFlights() {
		return flightService.getAllFlights();
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<Flights> remove(@PathVariable Integer id) {
		try {
			Flights booking = flightService.findFlights(id);
			flightService.deleteFlights(id);
			return new ResponseEntity<Flights>(booking, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/edit/{id}")
	public ResponseEntity<Flights> edit(@PathVariable Integer id, @RequestBody Flights bankAccount) {
		try {
			flightService.editFlights(id, bankAccount);
			return new ResponseEntity<Flights>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Flights>(bankAccount, HttpStatus.NOT_FOUND);
		}
	}
}
