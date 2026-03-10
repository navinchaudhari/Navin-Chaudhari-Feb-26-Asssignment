#include <iostream>
#include <string>
#include <exception>
using namespace std;

#define DIVIDEBYZERO DivideByZero(__FILE__, __func__, __LINE__);


class DivideByZero : public exception{
	string message;
	string fileName;
	string funcName;
	int line;
public:
	DivideByZero(string fileName, string funcName, int line)
		: fileName(fileName), funcName(funcName), line(line)
	 {
		message = fileName + " " + funcName + " " + to_string(line) + " " + "Divide By Zero";	
	 }
	
	const char* what() const noexcept {
		return message.c_str();
	}
	
	int getLine() const{
		return line;
	}
};

// noexcept(false) tells compiler that this function may throw an exception
int divide(int a, int b) noexcept(false) {
	if(b==0)
		throw DIVIDEBYZERO;
	return a/b;
}

int main(){
	try{
	cout<<"Quotient: " << divide(20,0) << endl;
	}
	catch(const DivideByZero& e){
		cerr << e.what() << endl;
		cerr << "Line No: " << e.getLine() << endl;
	}

	/*try{
		try{
			throw -1;
		}catch(int e){
			cout << e << " Inside Inner Catch" << endl;
				throw 5;	
		}
	} catch (int e){
		cout << e << " handled in outer catch" << endl;
	}*/
		

	
	return 0;
}

