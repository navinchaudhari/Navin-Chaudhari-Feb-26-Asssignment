/*1. Write a Java program to declare variables of all primitive data types and print their
values.

2. Take two numbers (int and double) and perform:
○ Addition
○ Division
○ Type casting result to int

3. Write a program to convert:
○ int → double
○ double → int

4. Write a program to find ASCII value of a character.

5. Take a character input and print:
○ Next character
○ Previous character*/

import java.util.Scanner;

class Questions1To5{
	
	int x;

	public static void main(String args[]){
		
		int [] a,b,c = new int[5];
		a = new int[3];
		b = new int[4];
		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		//nextNPreChar();

	}

	static void dataTypes(){
		byte b = 1;
		short s = 234;
		int i = 15632;
		long l = 123456789L;
		float f = 45.63f;
		double d = 78.1245689;
		char c = 'N';
		boolean bool = true;

		System.out.println("byte    : " +  b);
		System.out.println("Short   : " +  s);
		System.out.println("int     : " +  i);
		System.out.println("long    : " +  l);
		System.out.println("float   : " +  f);
		System.out.println("double  : " +  d);
		System.out.println("char    : " +  c);
		System.out.println("boolean : " +  bool);
	}

	static void addNDiv(){
		int num1 = 85;
		double num2 = 15.5;
		
		int add = (int)(num1 + num2);
		int div = (int)(num1 / num2);
		System.out.println("Addition : " +  add);
		System.out.println("Division : " +  div);
	}

	static void typeCast(){
		int i = 156;
		double d = i;
		System.out.println("int to double: " + d);

		double d1 = 456.98;
		int i1 = (int) d1;
		System.out.println("double to int: " + i1);
	}

	static void assciValue(){
		char c = 'J';
		System.out.println((int) c);
	}

	static void nextNPreChar(){
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			char next = ++c;
			char prev = (char)(c-2);
			System.out.println("Prev Char: " + prev);
			System.out.println("Next Char: " + next);

		}

}