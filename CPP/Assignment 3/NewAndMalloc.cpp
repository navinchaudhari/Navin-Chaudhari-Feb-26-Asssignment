#include <iostream>
#include <string>
using namespace std;

	void arrayUsingNew(){
		//Create array in Heap using new keyword
		int* array = new int[5];
		
		for(int i = 0; i < 5; i++){
			cout << "Enter " << i + 1 <<" element: ";
			cin >> array[i];
		}
		cout<<endl;

		for(int i=0; i<5; i++){
			cout << array[i] << " ";
		}
		
		//Delete that memory space using delete keyword
		delete[] array;
	}

	void arrayUsingMalloc(){
	
		int* array = (int*) malloc(sizeof(5));
	
		for(int i = 0; i < 5; i++){
			cout << "Enter " << i + 1 <<" element: ";
			cin >> array[i];
		}
		cout<<endl;

		for(int i=0; i<5; i++){
			cout << array[i] << " ";
		}

		free(array);
	}

	int main(void){
		arrayUsingMalloc();
		return 0;
	}