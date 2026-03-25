/*6. Write a program to check whether a number is:
○ Positive
○ Negative
○ Zero
7. Write a program to find the largest of three numbers.
8. Write a program to check whether a year is a leap year.
9. Create a simple calculator using switch:
○ Input: two numbers + operator
○ Perform: +, -, *, /
10. Write a program to check whether a character is:
● Vowel or consonant*/

import java.util.Scanner;

class Questions6To10{ 	 

	public static void main(String args[]){
		checkVowel();

	}

	static void checkNumber(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n>0){
			System.out.println("Positive");
		}else if(n<0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
	}

	static void largestOfThree(){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
	
		if(n1 > n2 && n1 > 3)
			System.out.println(n1+ " is Largest");
		else if(n2 > n1 && n2 > n3)
			System.out.println(n2+ " is Largest");
		else
			System.out.println(n3+ " is Largest");
	}

	static void leapYear(){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();	
		
		if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			System.out.println("Leap Year");	
		else
			System.out.println("Not Leap Year");
	}

	static void simpleCalculator(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();

		System.out.println("Enter Operator number: ");
		char operator = sc.next().charAt(0);
		
		switch(operator){
			case '+': System.out.println("Addition of two num is "+ (num1 + num2));
				break;
			case '-': System.out.println("Substraction of two num is "+ (num1 - num2));
				break;
			case '/': System.out.println("Division of two num is "+ (num1 / num2));
				break;
			case '*': System.out.println("Multiplication of two num is "+ (num1 * num2));
				break;
			default : System.out.println("Wrong Input");

		}
	}

	static void checkVowel(){
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		
	}
}