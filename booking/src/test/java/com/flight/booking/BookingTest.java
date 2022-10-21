package com.flight.booking;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.flight.booking.model.Booking;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class BookingTest {
    @Autowired
    private TestEntityManager eManager;

    @Test
    public void addPassenger(){
        Booking booking1 = new Booking();
        Booking booking2 = new Booking();
        Booking booking3 = new Booking();
        booking1.setComeBackTrip("12");
        booking1.setComeBackTrip("13");
        booking1.setComeBackTrip("16");
        booking1.setDestination("Sevilla");
        booking1.setDestination("Cordoba");
        booking1.setDestination("Jaen");
        booking1.setOneWayTrip("true");
        booking1.setOneWayTrip("true");
        booking1.setOneWayTrip("false");
        eManager.persist(booking1);
        eManager.persist(booking2);
        eManager.persist(booking3);
    }
}
