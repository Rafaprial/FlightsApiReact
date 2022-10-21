package com.flight.booking.service;

import java.util.List;

import com.flight.booking.model.Booking;

public interface BookingService {

	Booking saveBooking(Booking booking);

	Booking editBooking(Integer id, Booking booking);

	List<Booking> getAllBookings();


	void deleteBooking(Integer id);

	Booking findBooking(Integer id);

}
