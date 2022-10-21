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

import com.flight.booking.model.Booking;
import com.flight.booking.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/create")
	public String register(@RequestBody Booking booking) {

		bookingService.saveBooking(booking);
		return "booking has been added";
	}

	@GetMapping("/getAll")
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<Booking> remove(@PathVariable Integer id) {
		try {
			Booking booking = bookingService.findBooking(id);
			bookingService.deleteBooking(id);
			return new ResponseEntity<Booking>(booking, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/edit/{id}")
	public ResponseEntity<Booking> edit(@PathVariable Integer id, @RequestBody Booking bankAccount) {
		try {
			bookingService.editBooking(id, bankAccount);
			return new ResponseEntity<Booking>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Booking>(bankAccount, HttpStatus.NOT_FOUND);
		}
	}
}
