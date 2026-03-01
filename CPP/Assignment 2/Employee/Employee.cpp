#include <iostream>
#include <string>
#include "Employee.h"
using namespace std;

Employee::Employee()
{
    empID = 0;
    empName = "Default";
    empSalary = 0;
}

void Employee::setEmpID()
{
    // cout << (long)this << endl;
    this->empID = (long)this;
}
void Employee::setEmpName(string empName)
{
    this->empName = empName;
}
void Employee::setEmpSalary(double empSalary)
{
    this->empSalary = empSalary;
}

int Employee::getEmpID() const
{
    return empID;
}
string Employee::getEmpName() const
{
    return empName;
}
double Employee::getEmpSalary() const
{
    return empSalary;
}

void Employee::addNewEmployee()
{

    setEmpID();
    cout << "Name: ";
    cin >> empName;
    cout << "Salary: ";
    cin >> empSalary;
}

void Employee::calculateGrossSalary()
{
    if (empSalary <= 0)
    {
        cerr << "Salary cannot be zero" << endl;
        return;
    }

    int grossSalary;
    if (empSalary <= 5000)
    {
        grossSalary = empSalary + (10 * empSalary / 100);
        // cout << "Inside 5000 if " << grossSalary << " | " << empSalary << endl;
    }
    else if (empSalary > 5000 && empSalary <= 10000)
    {
        grossSalary = empSalary + (15 * empSalary / 100);
    }
    else if (empSalary > 10000)
    {
        grossSalary = empSalary + (20 * empSalary / 100);
    }

    cout << "Employee Gross Salary: " << grossSalary << endl;
}

void Employee::displayEmpDetails()
{
    cout << "*************************************************" << endl;
    cout << "       Employee Details" << endl;
    cout << "Employee Id      : " << empID << endl;
    cout << "Employee Name    : " << empName << endl;
    cout << "Employee Salary  : " << empSalary << endl;
    cout << "*************************************************" << endl;
}
void Employee::updateEmployee()

{

    int num;
    string name;
    int salary;
    cout << "=================================================" << endl;
    cout << "To update Employee Name Enter 1" << endl;
    cout << "To update Employee Salary Enter 2" << endl;
    cout << "=================================================" << endl;
    cout << endl;
    cout << "Enter No: ";
    cin >> num;

    switch (num)
    {
    case 1:
        cout << "Enter Name: ";
        cin >> name;
        setEmpName(name);
        break;

    case 2:
        cout << "Enter Salary: ";
        cin >> salary;
        setEmpSalary(salary);
        break;

    default:
        cout << "Invalid Number" << endl;
    }
}
void Employee::menuDrivenEmployee()
{
    Employee e;
    int num;
    do
    {
        cout << "------------------------------------------------" << endl;
        cout << "1 Add New Employee" << endl;
        cout << "2 Calculate Gross Salary" << endl;
        cout << "3 Display Employee Details" << endl;
        cout << "4 Update Employee Information" << endl;
        cout << "5 Exit Program" << endl;
        cout << "------------------------------------------------" << endl;
        cout << endl;

        cout
            << "Enter Number: ";
        cin >> num;

        int amount;

        switch (num)
        {
        case 1:
            e.addNewEmployee();
            break;

        case 2:
            e.calculateGrossSalary();
            break;

        case 3:
            e.displayEmpDetails();
            break;

        case 4:
            e.updateEmployee();
            break;

        case 5:
            cout << "EXIT" << endl;
            break;

        default:
            cerr << "Invalid Number" << endl;
            break;
        }

    } while (num != 5);
}