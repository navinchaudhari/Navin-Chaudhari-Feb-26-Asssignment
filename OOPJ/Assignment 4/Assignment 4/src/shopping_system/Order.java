package shopping_system;

import java.util.Scanner;

public class Order {
    String customerName;
    Product product[];

    public Order(String customerName) {
        this.customerName = customerName;
    }

    void addOrders() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Orders you want to place : ");
        int n = sc.nextInt();
        product = new Product[n];
        for (int i = 0; i < n; i++) {
            product[i] = new Product();
            System.out.print("Enter productID: ");
            product[i].productId = sc.nextInt();
            System.out.print("Enter Name: ");
            product[i].productName = sc.next();
            System.out.print("Enter Price: ");
            product[i].price = sc.next();

        }
    }

    double totalBill() {
        double total = 0;
        for (Product p : product) {
            total += p.getPrice();
        }
        return total;
    }

    double totalBill(double discount) {
        return totalBill() - (totalBill() * discount / 100);
    }

    String generateBill() {
        if (product == null) throw new RuntimeException("Product Count is ZERO");

        StringBuilder bill = new StringBuilder();
        bill.append("\n----- BILL -----\n");
        bill.append("Customer: ").append(customerName).append("\n");
        for (Product p : product) {
            bill.append("Product: " + p.productName + ", Price: " + p.price).append("\n");
        }
        bill.append("Total: ").append(totalBill()).append("\n");
        bill.append("Total with Discount: ").append(totalBill(18)).append("\n");
        return bill.toString();
    }

    void payment() {
        System.out.println("=============================\n");
        System.out.print("Enter Payment Type: ");
        System.out.println("1 = UPI");
        System.out.println("2 = Card");
        System.out.println("=============================\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();
        switch (choice) {
            case 1:
                System.out.print("Enter Amount: ");
                upi.pay(sc.nextInt());
                break;
            case 2:
                System.out.print("Enter Amount: ");
                card.pay(sc.nextInt());
                break;
            default:
                throw new RuntimeException("Invalid Payment Option");
        }
    }

    Scanner sc = new Scanner(System.in);
    int choice;

    void menuDriven() {
        do {
            System.out.println("------------------------------------\n");
            System.out.println("1 = Orders");
            System.out.println("2 = Generate Bill");
            System.out.println("3 = Payment");
            System.out.println("4 = Exit");
            System.out.println("------------------------------------\n");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    addOrders();
                    break;

                case 2:
                    System.out.println(generateBill());
                    break;

                case 3:
                    payment();
                    break;
                case 4:
                    System.out.println("** EXIT **");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 4);
    }


}
