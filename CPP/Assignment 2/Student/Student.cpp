#include <iostream>
#include <string>
using namespace std;

class Student
{
    string name;
    int rollNo;
    float marks;
    char grade;

public:
    Student()
    {
        name = "Student";
        rollNo = 0;
        marks = 0.0;
        grade = 'F';
    }
    // Setters
    void setName(string name)
    {
        this->name = name;
    }
    void setRollNo(int rollNo)
    {
        this->rollNo = rollNo;
    }
    void setMarks(float marks)
    {
        calculateGrade(marks);
        this->marks = marks;
    }
    void setGrade(char grade)
    {
        this->grade = grade;
    }

    // Getters
    string getName() const
    {
        return name;
    }
    int getRollNo() const
    {
        return rollNo;
    }
    float getMarks() const
    {
        return marks;
    }
    char getGrade() const
    {
        return grade;
    }

    // Behaiviors
    void calculateGrade(float marks)
    {
        if (marks >= 90 && marks <= 100)
            setGrade('A');
        else if (marks >= 80 && marks <= 89)
            setGrade('B');
        else if (marks >= 70 && marks <= 79)
            setGrade('C');
        else if (marks >= 60 && marks <= 69)
            setGrade('D');
        else
            setGrade('F');
    }

    void acceptStudentDetails()
    {
        cout << "=======================================" << endl;
        cout << "Enter Student Details" << endl;
        cout << "Name    : ";
        cin >> name;
        cout << "Roll No : ";
        cin >> rollNo;
        cout << "Marks   : ";
        cin >> marks;
        cout << "=======================================" << endl;
    }

    void displayStudentDetails()
    {
        calculateGrade(marks);
        cout << "***************************************" << endl;
        cout << "Name      :" << name << endl;
        cout << "Roll No   :" << rollNo << endl;
        cout << "Marks     :" << marks << endl;
        cout << "Grade     :" << grade << endl;
        cout << "***************************************" << endl;
    }
};

void studentMenuDrive();

int main(void)
{
    studentMenuDrive();
    return 0;
}

void studentMenuDrive()
{
    Student s;
    int num;
    do
    {
        cout << "------------------------------------------------" << endl;
        cout << "1 For Accept Information" << endl;
        cout << "2 For Display Information" << endl;
        cout << "3 For Calculate Grade" << endl;
        cout << "4 for Exit Program" << endl;
        cout << "------------------------------------------------" << endl;
        cout << endl;

        cout
            << "Enter Number: ";
        cin >> num;

        int marks;

        switch (num)
        {
        case 1:
            s.acceptStudentDetails();
            break;

        case 2:
            s.displayStudentDetails();
            break;

        case 3:
            cout << "Enter Marks: ";
            cin >> marks;
            s.calculateGrade(marks);
            break;

        case 4:
            cout << "EXIT" << endl;
            break;

        default:
            cerr << "Invalid Number" << endl;
            break;
        }

    } while (num != 4);
}
