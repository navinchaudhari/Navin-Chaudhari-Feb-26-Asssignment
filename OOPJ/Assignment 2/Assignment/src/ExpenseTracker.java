import java.util.Arrays;
import java.util.Scanner;

public class ExpenseTracker {
    double[] expenses = new double[7];

    void acceptExpenses() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int day = scanner.nextInt();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && expenses[day] == 0) {
            expenses[day] = amount;
            System.out.println("Expense Added Successfully");
        } else
            System.out.println("Already added");
    }

    double totalExpense() {
        double total = 0;
        for (int i = 0; i < expenses.length; i++) {
            total += expenses[i];
        }
        return total;
    }

    void averageExpense() {
        double avg = totalExpense() / 7;
        System.out.println("Average Expense: " + avg);
    }

    void highestExpense() {
        double highest = Double.MIN_VALUE;

        for (int i = 0; i < expenses.length; i++) {
            if (highest < expenses[i])
                highest = expenses[i];
        }
        System.out.println("Highest Expense is " + highest);
    }

    void lowestExpense() {
        double lowest = Double.MAX_VALUE;

        for (int i = 0; i < expenses.length; i++) {
            if (lowest > expenses[i] && expenses[i] != 0.0)
                lowest = expenses[i];
        }
        System.out.println("Lowest Expense is " + lowest);
    }

    void menuDriven() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================================");
            System.out.println("To Add Expense Enter 1");
            System.out.println("For Total Weekly Expense Enter 2");
            System.out.println("For Average Expense Enter 3");
            System.out.println("For Highest Expense Enter 4");
            System.out.println("For Lowest Expense Enter 5");
            System.out.println("To Exit 6");
            System.out.println("=========================================");

            System.out.print("Enter Number: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acceptExpenses();
                    break;
                case 2:
                    System.out.println("Total Weekly Expense: " + totalExpense());
                    break;
                case 3:
                    averageExpense();
                    break;
                case 4:
                    highestExpense();
                    break;
                case 5:
                    lowestExpense();
                    break;
                case 6:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        ExpenseTracker e1 = new ExpenseTracker();
        e1.menuDriven();
    }


}
