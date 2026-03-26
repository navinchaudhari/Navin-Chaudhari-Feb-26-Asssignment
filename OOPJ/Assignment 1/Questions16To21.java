/*16. Write a program to check whether a number is palindrome.
17. Write a program to find factorial of a number.
18. Write a program to print Fibonacci series up to N terms
19. Print:
*
**
***
****
20. Print:
1
12
123
1234

21. Print:
****
***
**
*

*/

import java.util.Scanner;
class Questions16To21{

	public static void main(String args[]){
			pattern3();

	}

	static void checkPalindrom(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		while(n != 0){
			int rem = n%10;
			reverse  = reverse * 10 + rem;
			n = n/10;
		}
		if(temp == reverse)
			System.out.println("Number is Palindrom");
		else
			System.out.println("Number is not Palindrom");
	}

	static void factorial(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long factorial = 1;
		for(int i = 1; i <= n; i++){
			factorial *= i;
		}
		System.out.println("Factorial of " + n + " number is " + factorial);		
	}

	static void fibonacci(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < n; i++){
			int res = a + b;
			a = b;
			b = res;
			System.out.print(res + " ");
		}
	}


	static void pattern1(){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void pattern2(){
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}
	static void pattern3(){
		for(int i = 1; i <= 5; i++){
			for(int j = 5; j >= i; j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}