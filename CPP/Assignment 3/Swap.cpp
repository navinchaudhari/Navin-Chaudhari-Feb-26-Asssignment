#include <iostream>
#include <string>
using namespace std;

	void swapByValue(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	void swapByReference(int &a, int &b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	void swapByAddress(int *a, int *b){
		int temp = *a;
		*a = *b;
		*b = temp;
	}

	int main(void){
		int a = 65;
		int b = 23;
	
		cout << "Before Swap"  << endl;
		cout << "a: " << a << endl;
		cout << "b: " << b << endl;

		cout<<endl;
		cout << "Using Call By Value"<<endl;
		swapByValue(a, b);
		cout << "a: " << a << endl;
		cout << "b: " << b << endl;

		cout<<endl;
		cout << "Using Call By Reference"<<endl;
		swapByReference(a, b);
		cout << "a: " << a << endl;
		cout << "b: " << b << endl;

		cout<<endl;
		cout << "Using Call By Address"<<endl;
		swapByAddress(&a, &b);
		cout << "a: " << a << endl;
		cout << "b: " << b << endl;


	}