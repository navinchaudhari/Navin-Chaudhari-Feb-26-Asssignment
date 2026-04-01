package banking;

public class UserAccount {
    public static void main(String[] args) {
        Account account1 = new Account("12345", "Navin", 1563.2);
        Account account2 = new Account("12346", "Bhavesh", 25638.01);
        Account account3 = new Account("12347", "Chaudhari", 10000);

        account1.printDetails();
        account2.printDetails();
        account3.printDetails();


        account1.deposit("Gpay", 1250);
        account2.deposit("Bhim", 1000);
        account3.deposit("Phone", 500);

        account1.printDetails();
        account2.printDetails();
        account3.printDetails();

        System.out.println("Total Accounts Created: " + Account.totalAccount);
    }
}
