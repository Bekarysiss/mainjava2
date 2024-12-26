// Bus Class
public class Bus {
    private String busNumber;
    private int capacity;
    private String route;

    // Constructor
    public Bus(String busNumber, int capacity, String route) {
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.route = route;
    }

    // Getter and Setter methods
    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    // Method to display bus details
    public void displayBusDetails() {
        System.out.println("Bus Number: " + busNumber + ", Capacity: " + capacity + ", Route: " + route);
    }

    // Method to compare two Bus objects
    public boolean equals(Bus other) {
        return this.busNumber.equals(other.busNumber);
    }
}
