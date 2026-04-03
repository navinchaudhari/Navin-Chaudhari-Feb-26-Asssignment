package inventory;

public class Main {
    public static void main(String[] args) {
        Electronic e1 = new Electronic(12, "TV", 12500);
        Inventory<Electronic> i1 = new Inventory<>(e1);
        Electronic obj = i1.getObj();
        obj.printDetails();

        Clothing c1 = new Clothing("Paithani", "Pune", 15000);
        Inventory<Clothing> i2 = new Inventory<>(c1);
        Clothing obj1 = i2.getObj();
        obj1.printDetails();
    }
}
