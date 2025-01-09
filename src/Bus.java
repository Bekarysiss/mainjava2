public class Bus extends TransportEntity {
    private int capacity;
    private String route;

    public Bus(String id, int capacity, String route) {
        super(id);
        this.capacity = capacity;
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + ", Route: " + route;
    }
}
