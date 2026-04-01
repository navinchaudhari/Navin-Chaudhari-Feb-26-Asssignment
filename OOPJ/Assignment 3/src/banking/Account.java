package banking;

public class Account {
    String accNo;
    String name;
    double balance;
    static int totalAccount;

    public Account(String accNo, String name, double balance) {
        totalAccount++;
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully");
        } else
            System.out.println("Failed");
    }

    void deposit(String upi, double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully using "+upi);
        } else
            System.out.println("Failed");
    }

    void withdraw(double amount) {
        if (amount > 0 && balance > amount) {
            balance -= amount;
            System.out.println("Transaction Successful");
        } else
            System.out.println("Transaction Failed");
    }

    void printDetails() {
        System.out.println("============================================");
        System.out.println("  ** Account Details **");
        System.out.println("Name             : " + name);
        System.out.println("Account No       : " + accNo);
        System.out.println("Balance          : " + balance);
        System.out.println();
        System.out.println("============================================");
    }

}
