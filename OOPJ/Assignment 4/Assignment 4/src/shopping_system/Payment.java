package shopping_system;

public interface Payment {
    void pay(double amount);
    void refund(double amount);
}
