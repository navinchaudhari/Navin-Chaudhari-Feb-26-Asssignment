#include <iostream>
#include <string>
#include <fstream>
using namespace std;

class Student
{

    int rollNo;
    string name;
    float marks;

public:
    Student() : rollNo(0), name(""), marks(0.0) {}
    Student(int rollNo, string name, float marks) : rollNo(rollNo), name(name), marks(marks)
    {
        cout << "Constructor initializing" << endl;
    }

    int getRollNo()
    {
        return rollNo;
    }
    string getName()
    {
        return name;
    }
    float getMarks()
    {
        return marks;
    }

    ~Student()
    {
        cout << "Destroying Student....." << endl;
    }
};
int main(void)
{
    Student *st = new Student[3];
    st[0] = Student(11, "Navin", 45.6);
    st[1] = Student(12, "Anil", 62.78);
    st[2] = Student(13, "Chaudhari", 84.12);

    // ofstream write;
    // write.open("student.txt", ios::app);

    // for (int i = 0; i < 3; i++)
    // {
    //     write << st[i].getRollNo() << " | " << st[i].getName() << " | " << st[i].getMarks() << endl;
    // }

    ifstream read;

    read.open("student.txt", ios::app);

    string line;
    while (getline(read, line))
    {
        cout << line << endl;
    }

    return 0;
}
