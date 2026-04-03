package ems;

import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double baseSalary;
    Employee employee[];

    private static int totalEmployees = 0;


    public Employee() {
    }

    public Employee(int empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
        totalEmployees++;
    }

    void addEmployees() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        employee = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Employee " + (i + 1) + " ---");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Base Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employee[i] = new Employee(id, name, salary);
        }
    }


    public double calculateSalary() {
        return baseSalary;
    }

    public double calculateSalary(double hraPercentage, double daPercentage) {
        double hra = baseSalary * hraPercentage / 100;
        double da = baseSalary * daPercentage / 100;
        return baseSalary + hra + da;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public void displayAllEmployees() {
        System.out.println("\n========== EMPLOYEE REPORTS ==========");
        for (Employee emp : employee) {
            emp.displayDetails();
        }
    }

    public void displayDetails() {
        System.out.println("=== Employee Details ===");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.printf("Base Salary: Rs.%.2f%n", baseSalary);
        System.out.printf("Salary (No Allowance):    Rs.%.2f%n", calculateSalary());
        System.out.printf("Salary (10%% HRA + 5%% DA): Rs.%.2f%n", calculateSalary(10, 5));
        System.out.println("========================\n");
    }
}



