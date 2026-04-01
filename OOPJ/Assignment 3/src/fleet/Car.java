package fleet;

public class Car extends Vehicle{
        String fuelType;

    public Car(String brand, float speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    public Car() {
    }

    void displayDetails() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
