package com.flight.booking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.booking.model.Flights;

public interface FlightsRepository  extends JpaRepository<Flights, Integer> {

}
