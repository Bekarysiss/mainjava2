// Commuter Class
public class Commuter {
    private String commuterId;
    private String name;
    private int age;

    // Constructor
    public Commuter(String commuterId, String name, int age) {
        this.commuterId = commuterId;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getCommuterId() {
        return commuterId;
    }

    public void setCommuterId(String commuterId) {
        this.commuterId = commuterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display commuter details
    public void displayCommuterDetails() {
        System.out.println("Commuter ID: " + commuterId + ", Name: " + name + ", Age: " + age);
    }

    // Method to compare two Commuter objects
    public boolean equals(Commuter other) {
        return this.commuterId.equals(other.commuterId);
    }
}
