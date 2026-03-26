/*11. Print numbers from 1 to 50 using:
● for loop
● while loop
12. Write a program to print sum of first N natural numbers.
13. Write a program to print multiplication table of a number.
14. Write a program to reverse a number.
15. Write a program to count digits in a number*/

import java.util.Scanner;
class Questions11To15{
	static void countDigits(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n != 0){
			n = n/10;
			count++;
		}
		System.out.println("Total Digits in number is " + count);
	}


	public static void main(String args[]){
		countDigits();

	}

	static void printNumbers(){
		for(int i = 1; i<=50; i++){
			System.out.print(i+" ");
		}
		
		System.out.println();
		int num = 1;
		while(num<=50){
			System.out.print(num+" ");
			num++;
		}
	}

	static void naturalNumSum(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		for(int i = 1; i<=n; i++){
			sum += i;
		}
		System.out.print("Sum of N Natural numbers is " + sum);
	}

	static void tables(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no: ");
		int n = sc.nextInt();
		for(int i = 1; i <=10; i++){
			System.out.println(n + " x " + i + " = " + (n*i));
		}
	}

	static void reverseNum(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		while(n != 0){
			int rem = n%10;
			reverse  = reverse * 10 + rem;
			n = n/10;
		}
		System.out.println("Reverse num: " + reverse);
	}

}