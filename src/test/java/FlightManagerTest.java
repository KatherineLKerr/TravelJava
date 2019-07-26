import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane;
    private Flight flight;
    private FlightManager flightManager;


    @Before
    public void setUp() {
        passenger1 = new Passenger("bob", 1);
        passenger2 = new Passenger("notbob", 2);
        plane = new Plane(PlaneType.BOEING100);
        flight = new Flight(plane, "FY8932", Airport.EDI, Airport.GLA, "19:30");
        flightManager = new FlightManager();
    }

    @Test
    public void canCalculateReservedBaggageWeightPerPassenger() {
        assertEquals(30, flightManager.calculateReservedBaggageWeight(flight));
    }

    @Test
    public void canCalculateBookedBaggageWeight() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(30, flightManager.calculateBookedBaggageWeight(flight));
    }

    @Test
    public void canCalculateRemainingBaggageWeight() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(120, flightManager.calculateRemainingBaggageWeight(flight));
    }
}
