public enum PlaneType {

    BOEING747(30, 100),
    CONCORD(20, 60),
    BOEING101(10, 200),
    BOEING100(5, 150);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }
}
