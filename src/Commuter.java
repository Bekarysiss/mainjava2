public class Commuter extends TransportEntity {
    private String name;
    private int age;

    public Commuter(String id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Name: " + name + ", Age: " + age;
    }
}

