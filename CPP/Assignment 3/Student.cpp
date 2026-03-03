#include <iostream>
#include <string>
using namespace std;

	class Student{

		int rollNo;
		string name;
		float marks;

	public:
		// Default Constructor;
		Student (){
		rollNo = 0;
		name = "Student";
		marks = 0.0;
		}
		
		// Parameterize Constructor
		Student (string n, int r, float m){
			rollNo = r;
			name = n;
			marks = m;
		}

		// Parameterized Constructor using `this`
		Student(int rollNo, string name, float marks){
			this->rollNo = rollNo;
			this->name = name;
			this-> marks = marks;
		}

		void displayStudent(){
			cout << "Student  Details"<<endl;
			cout << "Roll No : "<< rollNo << endl;
			cout << "Name    : "<< name << endl;
			cout << "Marks   : "<< marks << endl;
		}
	};

	int main(){
		Student s1;
		s1.displayStudent();

		cout<<endl;

		Student s2(131, "Navin", 56.83);
		s2.displayStudent();

		cout<<endl;
	
		Student s3("Bhavesh", 115, 84.36);
		s3.displayStudent();
	
		return 0;
	}