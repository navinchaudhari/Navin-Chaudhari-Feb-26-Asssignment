/*22. Write a program to check whether a number is prime.
23. Write a program to find sum of even and odd numbers separately (1 to N).
24. Write a program to find largest digit in a number.
25. Write a program to swap two numbers:
● With third variable
● Without third variable
26. Write a program to check whether a number is Armstrong*/

import java.util.*;
class Questions22To26 {

	static int count(int num){
		int count = 0;
		while(num != 0){
			int rem = num%10;
			count++;
			num /= 10;
		}
		return count;
	}
	
	static int power(int num, int pow){
		int powerOFnum = 1;
		for(int i = 1; i <= pow; i++){
			powerOFnum *= num;
		}
		return powerOFnum;
	}

	static void armstrong(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 10 && num > 0){
			System.out.println("Armstrong number");
			return;
		}
		int temp = num;
		int count = count(num);
		
		int sum = 0;

		
		while(num != 0){
			int rem = num % 10;
			sum = sum + power(rem, count);
			num /= 10;
		}

		if(sum == temp){
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}




	public static void main(String args[]){
		armstrong();

	}
	static void checkPrime(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean isPrime = true;
		for(int i = 2; i < num/2; i++){
			if(num % i == 0){
				isPrime = false;
					break;
				}
		}
		
		System.out.println(isPrime ? "Prime" : "Not Prime" );

	}

	static void sumOfNumbers(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sumOfEvenNumbers = 0;
		int sumOfOddNumbers = 0;
		
		for(int i = 1; i<=num; i++){
			if(i%2 == 0){
				sumOfEvenNumbers +=i;
			} else {
				sumOfOddNumbers +=i;
			}
		}
		
		System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
		System.out.println("Sum of Odd Numbers: " + sumOfOddNumbers);
		
	}

	static void largestDigit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();

		int largest  = 0;
		while(num != 0){
			int rem = num % 10;
			if(rem > largest){
				largest = rem;
			}
			num /= 10;
		}
		System.out.println(largest);
		
	}

	static void swap1(){
		// Using Third variable
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap: ");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("================================");
		System.out.println("After Swap: ");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}

	static void swap2(){
		// Using addition and Substraction
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap: ");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("================================");
		System.out.println("After Swap: ");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}

	static void swap3(){
		// Using xor
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap: ");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;

		System.out.println("================================");
		System.out.println("After Swap: ");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}