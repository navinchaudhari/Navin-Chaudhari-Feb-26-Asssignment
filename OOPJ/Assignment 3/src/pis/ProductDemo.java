package pis;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        product.addProduct();
        product.printProducts();
//        product.updatePrice(1000f);
//        product.printProducts();
//
//        product.updatePrice(500,50);
//        product.printProducts();

        product.updateStockQuantity(5);
        product.printProducts();
    }
}
