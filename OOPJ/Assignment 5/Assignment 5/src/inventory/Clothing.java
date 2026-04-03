package inventory;

public class Clothing {
    String type;
    String brand;
    float price;

    public Clothing() {
    }

    public Clothing(String type, String brand, float price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    void printDetails() {
        System.out.println("Clothes Details");
        System.out.println("Type: " + type + ", Brand: " + brand + ", Price: " + price);
    }
}
