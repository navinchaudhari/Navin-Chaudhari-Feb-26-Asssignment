import java.util.Scanner;

class MenuDrivenJavaProgram{

public static void daysOfWeek(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day from 1 to 7 :");
		int day = sc.nextInt();

		switch(day){
		case 1 : System.out.println("The day is Monday");
			 break;
		case 2 : System.out.println("The day is Tuesday ");
			 break;
		case 3 : System.out.println("The day is Wednesday");
			 break;
		case 4 : System.out.println("The day is Thursday");
			 break;
		case 5 : System.out.println("The day is Friday");
			 break;
		case 6 : System.out.println("The day is Saturday");
			 break;
		case 7 : System.out.println("The day is Sunday");
			 break;
		default : System.out.println("Invalid day Number");
			 break;
		}
	}

	public static void gradeEvaluation(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths marks: ");
		int maths = sc.nextInt();

		System.out.println("Enter Science marks: ");
		int science = sc.nextInt();

		System.out.println("Enter History marks: ");
		int history = sc.nextInt();

		int avg=(maths+science+history)/3;
		
		if(avg>=90){
			System.out.println("Grade: A");	
		} else if(avg>=70 && avg<90){
			System.out.println("Grade: B");
		} else if(avg>=50 && avg<70){
			System.out.println("Grade: C");
		} else if(avg>=30 && avg<50){
			System.out.println("Grade: D");
		} else {
			System.out.println("Fail");
		}
	}


	public static void leapYear(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		
		if(((year % 4==0) && (year % 100 !=0) || (year % 400==0)) ){	
			System.out.println(year + " is a leap year");
		} else{
			System.out.println(year + " is not a leap year");	
		}
	}


	public static void uninitializedVariable(){

		byte a=0;
		short b=0;
		int c= 0;
		long d=0;
		float e = 0.0f;
		double f=0.0;
		char g='a';
		boolean h = true;


		System.out.println("byte: "+a);
		System.out.println("short: "+b);
		System.out.println("int: "+c);
		System.out.println("long: "+d);
		System.out.println("float: "+e);
		System.out.println("double: "+f);
		System.out.println("char: "+g);
		System.out.println("boolean: "+h);
	}

	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("----------------------------------------------");
			System.out.println("Problem 1: Grade Evaluation System");
			System.out.println("Problem 2: Leap Year Check");
			System.out.println("Problem 3: Day of the week");
			System.out.println("Problem 4: Identify Default Values of Variables");
			System.out.println("Case 5: Exit");
			System.out.println("----------------------------------------------");
			System.out.println("Enter Number : ");
			num=sc.nextInt();

			switch(num){
			case 1 : gradeEvaluation();
				 System.out.println("*********************************************");
				 break;
			case 2 : leapYear();
				 System.out.println("*********************************************");
				 break;
			case 3 : daysOfWeek();
				 System.out.println("*********************************************");
				 break;
			case 4 : uninitializedVariable();
				 System.out.println("*********************************************");
				 break;
			case 5 : System.out.println("Exit");
				 System.out.println("*********************************************");
				 break;
			default :System.out.println("Invalid number");
				 System.out.println("*********************************************");
				 break;
			}
		} while(num!=5);
	
	}





















}