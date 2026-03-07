#include <iostream>
#include <string>
using namespace std;

	class Student{
		int sId;
		string name;
		float marks;

	public:
		Student& setId(int id){
			this -> sId = id;
			return *this;
		}

		Student& setName(string name){
			this -> name = name;
			return *this;
		}
		
		Student& setMarks(int marks){
			this -> marks = marks;
			return *this;
		}
		
		Student& display(){
			cout << "Student Details" << endl;
			cout << "Id      : " << this->id << endl;
			cout << "Name    : " << this->name << endl;
			cout << "Marks   : " << this->marks << endl;
			return *this;
		}
	};

	int main(void){
		Student s;
		s.setMarks(65.3).setName("Navin").setId(123).display();
		return 0;
	}