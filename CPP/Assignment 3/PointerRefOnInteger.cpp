#include <iostream>
#include <string>
using namespace std;

	int main(void){
		int num = 15;
		cout << num << endl;

		int *ptrNum = &num;
		int &refNum = num;

		// Valid : it prints last modified value
		*ptrNum = 60;
		refNum = 80;
		
		cout << num << endl;
	}