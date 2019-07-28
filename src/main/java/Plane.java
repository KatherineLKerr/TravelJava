public class Plane {

    private PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public int getTotalWeight() {
        return type.getTotalWeight();
    }

    public int getCapacity() {
        return type.getCapacity();
    }

}
