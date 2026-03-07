#include <iostream>
#include <string>
using namespace std;
class Employee
{

    int id;
    string name;
    mutable int accessCount = 0;

public:
    Employee() : id(0), name("") {}

    Employee(int id, string name) : id(id), name(name) {}

    //Deep Copy Constructor to create copy object on new memory address
    //After commenting constructor it will be shallow copy constructor
    Employee(Employee &emp)
    {
        new Employee(emp.id, emp.name);
    }

    void display() const
    {
        cout << "Total Count: " << ++accessCount << endl;
    }
};

int main(void)
{
    Employee emp1(12, "navin");
    emp1.display();
    emp1.display();
    emp1.display();
    emp1.display();
    emp1.display();
    emp1.display();

    
    /*
        If we didn't write our own deep copy constructor then it create an copy of that object pointing
        to the same memory address of that object. As it is pointing to the same memory address, display()
        function that we are calling is calling on same object although it is copy object and increase its count
        on above object.

        But when we write our own deep copy constructor at that time it will create copy object but on another
        memory address thus at time when we call display function on another object it will start from zero.

        To see the difference comment Copy constructor and see the difference between output.
    */

   // Deep Copy
    Employee emp2 = emp1;

    emp2.display();
    emp2.display();
    emp2.display();
    emp2.display();
    emp2.display();
    emp2.display();
    return 0;
}