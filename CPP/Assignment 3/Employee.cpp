#include <iostream>
#include <string>
using namespace std;

	class Employee{

		const int employeeId;
		string name;
		float salary;
	
	public:

		Employee (int employeeId, string name, float salary) : employeeId(employeeId), name(name), salary(salary) {

		}

		// We Cannot modify const variable
		/*void setEmployeeId(int id){
			this -> employeeId = id;
		}*/
		
		void display(){
			cout << "Employee Details"<<endl;
			cout << "Id       : " << employeeId << endl;
			cout << "Name     : " << name << endl;
			cout << "Salary   : " << salary << endl;
	
		}
	};

	int main(void) {
		Employee e(123, "Navin", 1234.56);
		//e.setEmployeeId(321);
		e.display();
		
		
		return 0;
	}