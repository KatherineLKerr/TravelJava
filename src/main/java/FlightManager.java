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