public class FlightManager {

    private Flight flight;

    public FlightManager() {
    }

    public int calculateReservedBaggageWeight(Flight flight) {
        return flight.planeTotalWeight() / flight.planeCapacity();
    }

    public int calculateBookedBaggageWeight(Flight flight) {
        int numOfBags = flight.getNumOfBags();
        return numOfBags * 10;
    }

    public int calculateRemainingBaggageWeight(Flight flight) {
        return flight.planeTotalWeight() - calculateBookedBaggageWeight(flight);
    }
}

//Create a FlightManager class which has methods to:
//    calculate how much baggage weight should be reserved for each passenger for a flight
//    calculate how much baggage weight is booked by passengers of a flight
//    calculate how much overall weight reserved for baggage remains for a flight
