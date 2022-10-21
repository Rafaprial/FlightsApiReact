package com.flight.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.booking.model.Booking;
import com.flight.booking.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;

	
	@Override
	public Booking saveBooking(Booking booking) {
		
		return bookingRepository.save(booking);
	}


	public void deleteBooking(Integer id) {
		bookingRepository.deleteById(id);
	}

	public Booking editBooking(Integer id, Booking booking) {
		Booking old = bookingRepository.findById(id).get();
		old.edit(booking);
		return saveBooking(old);
	}


	@Override
	public Booking findBooking(Integer id) {
		return bookingRepository.findById(id).get();
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}





	
}
