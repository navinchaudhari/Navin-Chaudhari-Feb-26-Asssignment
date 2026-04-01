package fleet;

public class VehicleSystem {
    public static void main(String[] args) {

        Car myCar = new Car("Tesla", 0, "Electric");
        Bike myBike = new Bike("Yamaha", 0, 45.5f);


        myCar.displayDetails();
        myBike.displayDetails();


        System.out.println("\nUpdating speeds...");
        myCar.updateSpeed(120);
        myBike.updateSpeed(60);


        myCar.displayDetails();
        myBike.displayDetails();
    }
}
