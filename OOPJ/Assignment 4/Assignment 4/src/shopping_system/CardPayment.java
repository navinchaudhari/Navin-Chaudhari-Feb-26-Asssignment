package shopping_system;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " successful through Card");

    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of " + amount + " initiated through Card");

    }
}
