package shopping_system;

public class Product {
    int productId;
    String productName;
    String price;
    static int productCount;

    public Product() {
        productCount++;
    }

    public Product(int productId, String productName, String price) {
        productCount++;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        try {
            return Double.parseDouble(price);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    /*public String toString() {
        return "[Name: " + productName + ", " + price + "]";
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
