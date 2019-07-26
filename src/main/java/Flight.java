import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengersArray;
    private Plane plane;
    private String flightNumber;
    private Airport destination;
    private Airport departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, Airport destination, Airport departureAirport, String departureTime) {
        this.passengersArray = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getPassengersArraySize() {
        return passengersArray.size();
    }

    public int returnAvailableSeats() {
        int numOfPassengers = this.passengersArray.size();
        int capacity = this.plane.getCapacity();
        return capacity - numOfPassengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (returnAvailableSeats() > 0) {
            passengersArray.add(passenger);
        }
    }

    public int planeTotalWeight() {
        return plane.getTotalWeight();
    }

    public int planeCapacity() {
        return plane.getCapacity();
    }

    public int getNumOfBags() {
        int bags = 0;
        for (Passenger passenger : passengersArray) {
            bags += passenger.getNumOfBags();
        }
        return bags;
    }
}