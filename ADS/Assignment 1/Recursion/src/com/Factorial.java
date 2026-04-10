package com;

public class Factorial {
	
	static long factorial(int num) {
		if(num < 0) {
			System.out.println("Invalid Number");
			return -1;
		}
		
		if(num == 0) {
			return 1;
		}
		
		return num * factorial(num-1);
		
		
	}

	public static void main(String[] args) {
		long fact = factorial(10);
		System.out.println("Factorial is "+ fact);

	}

}
