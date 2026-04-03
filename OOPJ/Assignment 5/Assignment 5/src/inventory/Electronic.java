package inventory;

public class Electronic {
    int id;
    String name;
    float price;

    public Electronic() {
    }
    public Electronic(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void printDetails() {
        System.out.println("Electronic Details");
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}
