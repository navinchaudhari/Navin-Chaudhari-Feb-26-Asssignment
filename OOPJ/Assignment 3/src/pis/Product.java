package pis;

import java.util.Scanner;

public class Product {
    int productID;
    String productName;
    float price;
    int quantity;

    public Product(int productID, String productName, float price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    float totalInventory() {
        return quantity * price;
    }

    void updateStockQuantity(int quantity) {
        this.quantity = quantity;
    }

    void updatePrice(float price) {
        this.price = price;
    }

    void updatePrice(float price1, float discount) {
        this.price = this.price - (price1 * discount / 100) ;
    }

    void addProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ProductId: ");
        productID = sc.nextInt();

        System.out.print("Name: ");
        productName = sc.next();

        System.out.print("Price: ");
        price = sc.nextFloat();

        System.out.print("Quantity: ");
        quantity = sc.nextInt();

    }


    void printProducts() {
        System.out.println("-------------------------------------");
        System.out.println(" ** Product Details **");
        System.out.println("ProductID         : " + productID);
        System.out.println("Name              : " + productName);
        System.out.println("Price             : " + price);
        System.out.println("Quantity          : " + quantity);
        System.out.println("Total Inventory   : " + totalInventory());
        System.out.println();
    }

}
