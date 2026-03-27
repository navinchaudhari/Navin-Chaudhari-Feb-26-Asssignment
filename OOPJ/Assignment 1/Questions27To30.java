/*27. Take marks of 5 subjects and:
● Calculate total
● Calculate percentage
● Print grade (A/B/C/Fail)
28. Take user age and:
● Check eligibility for voting
29. Create a menu-driven program:
1. Add
2. Subtract
3. Exit
30. Take a number and print its table until user stops (use loop).*/

import java.util.Scanner;
class Questions27To30{
	
	public static void main(String args[]){
		finiteTable();

	}
	static void marks(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks ");
		System.out.print("Maths: ");
		int m = sc.nextInt();

		System.out.print("Science: ");
		int s = sc.nextInt();

		System.out.print("History: ");
		int h = sc.nextInt();

		System.out.print("English: ");
		int e = sc.nextInt();

		System.out.print("Geography: ");
		int g = sc.nextInt();
	
		int total = m + s + h + e + g;
		float percentage = (total / 500f) * 100;																																																																					

		System.out.println("Total marks: " + total);
		System.out.println("Percentage: " + percentage);
		
		if(percentage >= 90 && percentage <=100){
			System.out.println("Grade: A");
		} else if(percentage >= 70 && percentage <90){
			System.out.println("Grade: B");
		} else if(percentage >= 50 && percentage <70){
			System.out.println("Grade: C");
		} else if(percentage >= 40 && percentage <50){
			System.out.println("Grade: D");
		}else {
			System.out.println("Grade: Fail");
		}
	}

	static void voteEligibility(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = sc.nextInt();	

		if(age >= 18)
			System.out.println("Eligible to Vote");
		else
			System.out.println("Not Eligible to Vote");	

	}
	
	static void addSubtract(){
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter number: (1 for addition, 2 for substractin and 3 for exit)");
			choice = sc.nextInt();
			
			System.out.print("Enter num1: ");
			int num1 = sc.nextInt();

			System.out.print("Enter num2: ");
			int num2 = sc.nextInt();
			
			switch(choice){
				case 1 : System.out.println("Addition of numbers is: " + (num1 + num2));
					break;
				
				case 2 : System.out.println("Substraction of numbers is: " + (num1 - num2));
					break;

				case 3 : System.out.println("EXIT");
					break;
			
				default : System.out.println("Wrong number");
			}
		}while(choice != 3);

	}

	static void finiteTable(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();	
		int count = 1;
		while(true){
			System.out.println(num * count);
			count++;
		}

	}
}
