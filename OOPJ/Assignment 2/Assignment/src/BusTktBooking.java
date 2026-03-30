import java.util.Arrays;
import java.util.Scanner;

public class BusTktBooking {
    static boolean[] seats = new boolean[10];

    static {
        Arrays.fill(seats, true);
    }

    void availableSeats() {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) System.out.print(i + " ");
        }
        System.out.println();
    }

    void bookSeat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seat number: ");
        int choice = sc.nextInt();

        if (seats[choice]) {
            seats[choice] = false;
            System.out.println("Seat Booked");
        } else
            System.out.println("Already Booked");

    }

    void cancelSeat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seat number: ");
        int cancel = sc.nextInt();

        if (!seats[cancel]) {
            seats[cancel] = true;
            System.out.println("Seat Canceled");
        } else
            System.out.println("Not Booked yet");
    }

    void menuDrivenProgram() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================================");
            System.out.println("To View Available Seats 1");
            System.out.println("For Booking Seat Enter 2");
            System.out.println("To Cancel Seat Enter 3");
            System.out.println("To Exit 4");
            System.out.println("=========================================");

            System.out.print("Enter Number: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    availableSeats();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    cancelSeat();
                    break;
                case 4:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        BusTktBooking bs = new BusTktBooking();
        bs.menuDrivenProgram();

    }

}
