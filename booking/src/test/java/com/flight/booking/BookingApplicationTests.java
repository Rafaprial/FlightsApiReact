package com.flight.booking;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.flight.booking.model.Passengers;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class BookingApplicationTests {
    @Autowired
    private TestEntityManager eManager;

    @Test
    public void addPassenger(){
        Passengers passenger1 = new Passengers();
        Passengers passenger2 = new Passengers();
        Passengers passenger3 = new Passengers();
        passenger1.setCompleteName("Antonio Perez");
        passenger2.setCompleteName("Pepe Pedrosa");
        passenger3.setCompleteName("Manuel trujillo");
        passenger1.setAge("14");
        passenger2.setAge("23");
        passenger3.setAge("43");
        passenger1.setNifOrPassport("42afdf");
        passenger2.setNifOrPassport("34fdsf");
        passenger3.setNifOrPassport("asdf324");
        eManager.persist(passenger1);
        eManager.persist(passenger2);
        eManager.persist(passenger3);
    }
}
