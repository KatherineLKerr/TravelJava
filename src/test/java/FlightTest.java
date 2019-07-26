import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING100);
        flight = new Flight(plane, "FR756", Airport.EDI, Airport.GLA, "15:00");
        passenger1 = new Passenger("bob", 1);
    }

    @Test
    public void passengersArrayStartsEmpty() {
        assertEquals(0, flight.getPassengersArraySize());
    }

    @Test
    public void canCheckCapacityOfPlane() {
        assertEquals(5, flight.returnAvailableSeats());
    }

    @Test
    public void canAddPassengersIfUnderCapacity() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPassengersArraySize());
    }

    @Test
    public void cannotAddPassengersIfOverCapacity() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger1);
        assertEquals(5, flight.getPassengersArraySize());
    }

}
