package com.flight.booking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.booking.model.Booking;

public interface BookingRepository  extends JpaRepository<Booking, Integer> {

}
