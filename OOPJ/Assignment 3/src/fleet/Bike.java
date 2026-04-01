package fleet;

public class Bike extends Vehicle {
    float mileage;

    public Bike(String brand, float speed, float mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    public Bike(float mileage) {
        this.mileage = mileage;
    }

    public Bike() {
    }

    void displayDetails() {
        System.out.println("\n--- Bike Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Mileage: " + mileage + " kmpl");
    }
}
