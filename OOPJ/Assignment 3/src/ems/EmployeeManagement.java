package ems;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addEmployees();
        employee.displayAllEmployees();
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}
