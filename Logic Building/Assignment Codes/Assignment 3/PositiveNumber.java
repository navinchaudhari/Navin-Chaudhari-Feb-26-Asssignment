import java.util.Scanner;
class PositiveNumber{


	public static void askForPositiveNumber(){
	
		Scanner sc = new Scanner(System.in);
		int num;
		
		do{
			System.out.println("Enter Number");
			num=sc.nextInt();
		} while(num<1);	

		System.out.println("You have entered Positive Number: "+num);
	}

	public static void main(String a[]){
	
		askForPositiveNumber();
	}
}