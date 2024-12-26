// TransportService Class
public class TransportService {
    private String serviceName;
    private Bus[] buses;
    private Commuter[] commuters;
    private int busCount;
    private int commuterCount;

    // Constructor
    public TransportService(String serviceName) {
        this.serviceName = serviceName;
        this.buses = new Bus[10]; // Assuming maximum of 10 buses
        this.commuters = new Commuter[10]; // Assuming maximum of 10 commuters
        this.busCount = 0;
        this.commuterCount = 0;
    }

    // Getter and Setter methods
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    // Method to add a bus
    public void addBus(Bus bus) {
        if (busCount < buses.length) {
            buses[busCount++] = bus;
        }
    }

    // Method to add a commuter
    public void addCommuter(Commuter commuter) {
        if (commuterCount < commuters.length) {
            commuters[commuterCount++] = commuter;
        }
    }

    // Method to display service details
    public void displayServiceDetails() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Buses:");
        for (int i = 0; i < busCount; i++) {
            buses[i].displayBusDetails();
        }
        System.out.println("Commuters:");
        for (int i = 0; i < commuterCount; i++) {
            commuters[i].displayCommuterDetails();
        }
    }

    // Method to compare two TransportService objects
    public boolean equals(TransportService other) {
        return this.serviceName.equals(other.serviceName);
    }
}
