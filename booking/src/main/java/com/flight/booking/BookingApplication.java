package com.flight.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flight.booking.selenium.GoogleTest;
import com.flight.booking.selenium.InstallDriversJava;


@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {
		InstallDriversJava inst = new InstallDriversJava();
		SpringApplication.run(BookingApplication.class, args);
		inst.chromeSession();
		GoogleTest.main(args);

	}

}
