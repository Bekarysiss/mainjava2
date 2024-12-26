// Main Class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Creating Bus objects
        Bus bus1 = new Bus("B101", 50, "Route A");
        Bus bus2 = new Bus("B102", 60, "Route B");

        // Creating Commuter objects
        Commuter commuter1 = new Commuter("C001", "John Doe", 25);
        Commuter commuter2 = new Commuter("C002", "Jane Smith", 30);

        // Creating TransportService object
        TransportService service1 = new TransportService("City Transport");

        // Adding buses and commuters to the service
        service1.addBus(bus1);
        service1.addBus(bus2);
        service1.addCommuter(commuter1);
        service1.addCommuter(commuter2);

        // Displaying service details
        service1.displayServiceDetails();

        // Comparing objects
        System.out.println("\nComparing Buses:");
        System.out.println("Is bus1 equal to bus2? " + bus1.equals(bus2));

        System.out.println("\nComparing Commuters:");
        System.out.println("Is commuter1 equal to commuter2? " + commuter1.equals(commuter2));

        System.out.println("\nComparing Transport Services:");
        TransportService service2 = new TransportService("City Transport");
        System.out.println("Is service1 equal to service2? " + service1.equals(service2));
    }
}
