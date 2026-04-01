import java.util.Scanner;

/*
Requirements:
        ● Each student has:
        ○ Roll number, name
○ Marks in multiple subjects
○ Contact details (phone, email)
● System should:
        ○ Store multiple students
○ Calculate total & average marks
○ Track total students admitted
● Support:
        ○ Flexible average calculation
● Display formatted student report
*/
public class StudentERP {

    int rollNo;
    String name;
    String phoneNo;
    String email;
    double[] marks = new double[5];
    Scanner sc = new Scanner(System.in);

    static int totalStudent;

    public StudentERP() {
        totalStudent++;
    }

    public StudentERP(int rollNo, String name, String phoneNo, String email) {
        totalStudent++;
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }


    void userMarks() {
        System.out.println("Enter Marks of Students for 5 Subjects");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
        }
        System.out.println();
    }

    double totalMarks() {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        return total;
    }

    double average() {
        return totalMarks() / marks.length;
    }

    void printDetails() {
        System.out.println("** Student ERP Report **");
        System.out.println("Name         : " + name);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Mobile No    : " + phoneNo);
        System.out.println("Email        : " + email);
        System.out.printf("Total Marks   : %.2f%n", totalMarks());
        System.out.printf("Average Marks : %.2f%n", average());
        System.out.println();
    }

    public static void main(String[] args) {
        StudentERP erp1 = new StudentERP(13, "Navin", "9767684515", "navin@1312gmail.com");
        erp1.userMarks();

        StudentERP erp2 = new StudentERP(14, "Bhavesh", "9767684516", "Bhavesh@131gmail.com");
        erp2.userMarks();


        StudentERP erp3 = new StudentERP(15, "Chaudhari", "9767684517", "chaudhari@7515gmail.com");
        erp3.userMarks();

        erp1.printDetails();
        erp2.printDetails();
        erp3.printDetails();

        StudentERP erp4 = new StudentERP();
        StudentERP erp5 = new StudentERP();
        StudentERP erp6 = new StudentERP();

        System.out.println("Total Student Admitted: " + totalStudent);
    }

}
