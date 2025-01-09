import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransportService {
    private String serviceName;
    private List<Bus> buses;
    private List<Commuter> commuters;

    public TransportService(String serviceName) {
        this.serviceName = serviceName;
        this.buses = new ArrayList<>();
        this.commuters = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void addCommuter(Commuter commuter) {
        commuters.add(commuter);
    }

    public List<Bus> filterBusesByCapacity(int minCapacity) {
        return buses.stream()
                .filter(bus -> bus.getCapacity() >= minCapacity)
                .collect(Collectors.toList());
    }

    public List<Commuter> searchCommuterByName(String name) {
        return commuters.stream()
                .filter(commuter -> commuter.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Bus> sortBusesByCapacity() {
        return buses.stream()
                .sorted(Comparator.comparingInt(Bus::getCapacity))
                .collect(Collectors.toList());
    }

    public void displayServiceDetails() {
        System.out.println("Transport Service: " + serviceName);
        System.out.println("\nBuses:");
        buses.forEach(System.out::println);
        System.out.println("\nCommuters:");
        commuters.forEach(System.out::println);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TransportService that = (TransportService) obj;
        return serviceName.equals(that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }

    @Override
    public String toString() {
        return "TransportService{" +
                "serviceName='" + serviceName + '\'' +
                ", buses=" + buses +
                ", commuters=" + commuters +
                '}';
    }
}
