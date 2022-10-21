package com.flight.booking.repository;


import com.flight.booking.model.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengersRepository extends JpaRepository<Passengers, Integer> {

}
