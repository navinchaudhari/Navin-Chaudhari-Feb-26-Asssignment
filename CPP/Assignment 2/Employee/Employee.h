#include <iostream>
#include <string>
using namespace std;

class Employee
{

    int empID;
    string empName;
    double empSalary;

public:
    Employee();
    void setEmpID();
    void setEmpName(string empName);
    void setEmpSalary(double empSalary);

    int getEmpID() const;
    string getEmpName() const;
    double getEmpSalary() const;

    void addNewEmployee();
    void calculateGrossSalary();
    void displayEmpDetails();
    void updateEmployee();
    void menuDrivenEmployee();
};