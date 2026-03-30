import java.util.Scanner;

public class MobileRecharge {
    static void recharge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("    ** Recharge Plans **");
        System.out.println("Rs. 199 → 28 days validity");
        System.out.println("Rs. 399 → 56 days validity");
        System.out.println("Rs. 599 → 64 days validity");

        System.out.print("Enter Mobile Number: ");
        long mobileNo = sc.nextLong();
        System.out.print("Enter Recharge Amount: ");
        int amount = sc.nextInt();

        switch (amount) {
            case 199:
                printRechargeDetails(mobileNo, amount, 28);
                break;
            case 399:
                printRechargeDetails(mobileNo, amount, 56);
                break;
            case 599:
                printRechargeDetails(mobileNo, amount, 64);
                break;
            default:
                System.out.println("Invalid Plan");
        }
    }

    static void printRechargeDetails(long mobileNo, int amount, int validity) {
        System.out.println("Recharge has been Successful for " + mobileNo + " number.");
        System.out.println("Amount: " + amount);
        System.out.println("Validity: " + validity + " Days");
    }

    public static void main(String[] args) {
        recharge();
    }
}
