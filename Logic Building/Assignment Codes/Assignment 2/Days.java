import java.util.Scanner;
class Days{

	public static void daysOfWeek(int day){

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


	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day no from 1 to 7");
		int day = sc.nextInt();
		
		daysOfWeek(day);
	
	}



}