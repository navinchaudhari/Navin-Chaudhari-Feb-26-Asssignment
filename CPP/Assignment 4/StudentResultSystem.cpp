#include <iostream>
#include <string>
using namespace std;

class Student
{
protected:
    int rollNo;

public:
    Student(int rollNo) : rollNo(rollNo) {}

    virtual void display()
    {
        cout << "Roll No: " << rollNo << endl;
    }
};

class Result : public Student
{
protected:
    float marks;

public:
    Result(int rollNo, float marks) : Student(rollNo), marks(marks) {}

    void display()
    {
        cout << "Roll No : " << rollNo << endl;
        cout << "Marks   : " << marks << endl;
    }
};

int main(void)
{
    Student *rs = new Result(12, 23.5);
    rs->display();
    return 0;
}