#include <iostream>
#include <string>
using namespace std;

	class Box{

		int length;
		int width;
		int height;

	public:
		Box(){
			length = 1;
			width = 1;
			height = 1;
		}
		Box(int length, int width, int height){
			this -> length = length;
			this -> width = width;
			this -> height = height;
		}

		void setLength(int length){
			this -> length = length;
		}
		
		void setWidth(int width){
			this -> width = width;
		}
		
		void setHeight(int height){
			this -> height = height;
		}

		void volumeOfBox(){
		int volume = length * height * width;
		cout << "Volume of Box is " << volume << endl;
		}

	};


	int main(void){
		//By using Default Constructor
		Box b;
		b.volumeOfBox();


		//Using Parameterized Constructor
		Box b1(12,15,10);
		b1.volumeOfBox();	

		//Using Setter Methods
		Box b3;
		b3.setLength(21);
		b3.setWidth(2);
		b3.setHeight(10);
		b3.volumeOfBox();

	}