package shopping_system;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " successful through UPI");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of " + amount + " initiated through UPI");
    }
}
