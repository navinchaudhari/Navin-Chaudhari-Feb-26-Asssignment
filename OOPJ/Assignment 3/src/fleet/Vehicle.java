package fleet;


public class Vehicle {
    String brand;
    float speed;

    static {
        System.out.println("[System] Initializing Vehicle Management Database...");
    }

    {
        System.out.println("[Log] New vehicle instance created.");
    }

    public Vehicle(String brand, float speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public Vehicle() {
    }

    void updateSpeed(int newSpeed) {
        this.speed = newSpeed;
        System.out.println("-> Speed updated to: " + speed + " km/h");
    }
}
