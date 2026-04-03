package report;

public class Main {
    public static void main(String[] args) {
        Integer i[] = {1, 2, 3, 4, 5, 6};
        Report.print("Employee IDs", i);

        String s[] = {"Navin", "Mahendra", "Omkar"};
        Report.print("Names", s);
    }
}
