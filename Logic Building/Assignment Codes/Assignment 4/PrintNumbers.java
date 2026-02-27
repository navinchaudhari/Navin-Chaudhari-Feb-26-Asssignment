import java.util.Scanner;

class PrintNumbers{

	static void printNumToN(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++){
			System.out.print(i+" ");
		}
	}

	static void printMultipleOfThree(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++){
			if(i%3==0){
			System.out.print(i+" ");
			}
		}
	}


	static void factorial(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println();
		long factorial=1;
		for(int i=1; i<=n; i++){
			factorial*=i;
		}
		System.out.println("Factorial of "+ n +" is " + factorial);
	}


	static void evenNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++){
			if(i%2==0){
			System.out.print(i+" ");
			}
		}
	}

	static void sumOfOddNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println();
		
		int sum=0;
		for(int i=1; i<=n; i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println("The sum of odd numbers from 1 to "+ n +" is: " + sum);
	}


	public static void main(String args[]){

		//printNumToN();
		//printMultipleOfThree();
		//factorial();
		//evenNumbers();
		sumOfOddNumbers();
	}





}