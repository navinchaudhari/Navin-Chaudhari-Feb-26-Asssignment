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
    Student();
    // Setters
    void setName(string name);
    void setRollNo(int rollNo);
    void setMarks(float marks);
    void setGrade(char grade);
    // Getters
    string getName() const;
    int getRollNo() const;
    float getMarks() const;
    char getGrade() const;

    // Behaiviors
    void calculateGrade(float marks);

    void acceptStudentDetails();

    void displayStudentDetails();
    void studentMenuDrive();
};