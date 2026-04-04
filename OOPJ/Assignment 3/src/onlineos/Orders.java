package onlineos;

import java.util.Scanner;

public class Orders {
    int orderId;
    String custName;
    String items;
    float price;
    Orders orders[];

    public Orders() {
    }

    public Orders(int orderId, String custName, String items, float price) {
        this.orderId = orderId;
        this.custName = custName;
        this.items = items;
        this.price = price;
    }

    void storeOders() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no of Orders: ");
        int n = sc.nextInt();
        orders = new Orders[n];

        for (int i = 0; i < n; i++) {
            orders[i] = new Orders();
            System.out.println("--- Enter Order Details for " + (i + 1) + " ---");
            System.out.print("Order ID: ");
            orders[i].orderId = sc.nextInt();

            System.out.print("Customer Name: ");
            orders[i].custName = sc.next();

            System.out.print("Item name: ");
            orders[i].items = sc.next();

            System.out.print("Price: ");
            orders[i].price = sc.nextFloat();
        }
    }

    double calculateBill() {
        double total = 0;
        for (Orders o : orders) {
            total += o.price;
        }
        return total;
    }

    double billWithGST(float gst) {
        return (calculateBill() * gst / 100) + calculateBill();
    }

    void printBillForOrder() {

//        System.out.println(String.format()orderId + "        " + custName + "        " + items + "       " + price);
        System.out.println("Order ID           : " + orderId);
        System.out.println("Customer Name      : " + custName);
        System.out.println("Order Item         : " + items);
        System.out.println("Price              : " + price);
    }

    void printAllOrderBill() {
        System.out.println("    --- Total Orders Bill --- ");
//        System.out.println("Order ID " + "    Customer Name " + "      Item " + "       Price");
        for (Orders o : orders) {
            o.printBillForOrder();
            System.out.println();
        }
        System.out.println("Total               : " + calculateBill());
        System.out.println("Total Bill With GST : " + billWithGST(18));
    }
}
